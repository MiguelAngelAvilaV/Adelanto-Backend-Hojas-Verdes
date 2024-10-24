/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.modelo;

import com.miguelav.conjuntohojasverdes.utilidades.Serializacion;
import com.miguelav.conjuntohojasverdes.utilidades.personas.Empleado;
import com.miguelav.conjuntohojasverdes.utilidades.Utilidades;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paola
 */
public class GestionEmpleados implements Serializacion<Empleado>{
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Empleado> listaRecuperada = new ArrayList<>();
    
    @Override
    public void adicionarObjeto(Empleado objA){
        listaEmpleados.add(objA); 
        try {
            guardarFichero();
        } catch (IOException ex) {
            Logger.getLogger(GestionEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int obtenerIndice(String Id){
        for(Empleado Empleado : listaRecuperada) {
            if(String.valueOf(Id).equals(String.valueOf(Empleado.getId()))){
                return listaRecuperada.indexOf(Empleado);
            }
        }
        return -1;
    }
    
    @Override
    public String listarObjetos(){
        String lista ="";
        if(!listaRecuperada.isEmpty()){
            for(Empleado Empleado : listaRecuperada) {
                lista = lista + Empleado.getNombre() + "\t" + Empleado.getId() + "\t" + Empleado.getCargo() + "\t\t" + Empleado.getFechaInicio() + "\n";
            }
        }
        return lista;
    }
    
    @Override
    public Empleado buscarPorID(int indice){
        Empleado encontrado = listaRecuperada.get(indice);
        return encontrado;
    }
    
    @Override
    public void actualizarObjeto(Empleado obj){
        for (Empleado Empleado : listaRecuperada){
            if(String.valueOf(obj.getId()).equals(String.valueOf(Empleado.getId()))){
                Empleado.setNombre(obj.getNombre());
                Empleado.setId(obj.getId());
                Empleado.setCargo(obj.getCargo());
                Empleado.setFechaInicio(obj.getFechaInicio());
            }
            try {
                actualizarFichero(listaRecuperada);
            } catch (IOException ex) {
                Logger.getLogger(GestionEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void eliminarObjeto(int indice){
        listaRecuperada.remove(indice);
        try {
            actualizarFichero(listaRecuperada);
        } catch (IOException ex) {
            Logger.getLogger(GestionEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int numObj(){
        int numEmpleados = listaRecuperada.size();
        return numEmpleados;
    }
    
    @Override
    public  void guardarFichero() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("infoEmpleados.csv"))) {
            for (Empleado obj : listaEmpleados) {
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(obj.getNombre())
                      .add(String.valueOf(obj.getId()))
                      .add(obj.getCargo())
                      .add(Utilidades.dateToString(obj.getFechaInicio()));
                bw.write(joiner.toString());
                bw.newLine();
            }
        }
    }
    
    @Override
    public void leerFichero() throws IOException, ClassNotFoundException {
        listaRecuperada.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("infoEmpleados.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Empleado Empleado = new Empleado(values[0], Utilidades.stringToDate(values[1]), values[2], Integer.parseInt(values[3]));
                listaRecuperada.add(Empleado);
            }
        }
    }
    
    @Override
    public void actualizarFichero(List<Empleado> lista)throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("infoEmpleados.csv"))) {
            for (Empleado obj : listaEmpleados) {
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(obj.getNombre())
                      .add(String.valueOf(obj.getId()))
                      .add(obj.getCargo())
                      .add(Utilidades.dateToString(obj.getFechaInicio()));
                bw.write(joiner.toString());
                bw.newLine();
            }
        }
    }
    
    @Override
    public void crearPDF() {
        try {
            Document doc = new Document();  //Creamos un objeto tipo documento
            
            Font tipo1 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 12, BaseColor.BLACK);
            Font tipo2 = FontFactory.getFont(BaseFont.TIMES_BOLD, 20, BaseColor.GREEN);
            
            PdfWriter.getInstance(doc, new FileOutputStream("Lista_de_Empleados.pdf"));  //lo asociamos como archivo y colocarle nombre
            doc.open();
            Paragraph titulo = new Paragraph("Lista de Empleados", tipo2);
            doc.add(titulo);
            for (Empleado Empleado : listaRecuperada){
                Paragraph txNom = new Paragraph("Nombre: " + Empleado.getNombre(), tipo1);
                Paragraph txId = new Paragraph("ID: " + Empleado.getId(), tipo1);
                Paragraph txCarg = new Paragraph("Cargo: "+ Empleado.getCargo(), tipo1);
                Paragraph txFInic = new Paragraph("Fecha de Inicio: " + Empleado.getFechaInicio(), tipo1);
                Paragraph txLinea = new Paragraph("------------------------------------------------------", tipo1);
                
                doc.add(txNom);
                doc.add(txId);
                doc.add(txCarg);
                doc.add(txFInic);
                doc.add(txLinea);
            }
            doc.addAuthor("Juan Andres Posada, Juan David González, Alejandro Munera, Miguel Angel Avila");
            doc.close(); 
        }catch(DocumentException | java.io.FileNotFoundException e){
            System.out.println("Error del archivo");
            e.printStackTrace();
        }
    }
}
