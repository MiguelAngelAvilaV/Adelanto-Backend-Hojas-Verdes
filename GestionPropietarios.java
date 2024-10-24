/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.modelo;

import com.miguelav.conjuntohojasverdes.utilidades.personas.Propietario;
import com.miguelav.conjuntohojasverdes.utilidades.Serializacion;

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
public class GestionPropietarios implements Serializacion<Propietario>{
    List<Propietario> listaPropietarios = new ArrayList<>();
    List<Propietario> listaRecuperada = new ArrayList<>();
    
    @Override
    public void adicionarObjeto(Propietario objA){
        listaPropietarios.add(objA); 
        try {
            guardarFichero();
        } catch (IOException ex) {
            Logger.getLogger(GestionPropietarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int obtenerIndice(String Id){
        for(Propietario Propietario : listaRecuperada) {
            if(String.valueOf(Id).equals(String.valueOf(Propietario.getId()))){
                return listaRecuperada.indexOf(Propietario);
            }
        }
        return -1;
    }
    
    @Override
    public String listarObjetos(){
        String lista ="";
        if(!listaRecuperada.isEmpty()){
            for(Propietario Propietario : listaRecuperada) {
                lista = lista + Propietario.getNombre() + "\t" + Propietario.getId() + "\t" + Propietario.getTelefono() 
                + "\t" + Propietario.getCorreo() + "\t" + Propietario.getProfesion() + "\t" + "\t\t" + Propietario.getOficio() + "\n";
            }
        }
        return lista;
    }
    
    @Override
    public Propietario buscarPorID(int indice){
        Propietario encontrado = listaRecuperada.get(indice);
        return encontrado;
    }
    
    @Override
    public void actualizarObjeto(Propietario obj){
        for (Propietario Propietario : listaRecuperada){
            if(String.valueOf(obj.getId()).equals(String.valueOf(Propietario.getId()))){
                Propietario.setNombre(obj.getNombre());
                Propietario.setId(obj.getId());
                Propietario.setTelefono(obj.getTelefono());
                Propietario.setCorreo(obj.getCorreo());
                Propietario.setProfesion(obj.getProfesion());
                Propietario.setOficio(obj.getOficio());
            }
            try {
                actualizarFichero(listaRecuperada);
            } catch (IOException ex) {
                Logger.getLogger(GestionPropietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void eliminarObjeto(int indice){
        listaRecuperada.remove(indice);
        try {
            actualizarFichero(listaRecuperada);
        } catch (IOException ex) {
            Logger.getLogger(GestionPropietarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int numObj(){
        int numPropietarios = listaRecuperada.size();
        return numPropietarios;
    }
    
    @Override
    public  void guardarFichero() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("infoPropietarios.csv"))) {
            for (Propietario obj : listaPropietarios) {
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(obj.getNombre())
                      .add(String.valueOf(obj.getId()))
                      .add(obj.getTelefono())
                      .add(obj.getCorreo())
                      .add(obj.getProfesion())
                      .add(obj.getOficio());
                bw.write(joiner.toString());
                bw.newLine();
            }
        }
    }
    
    @Override
    public void leerFichero() throws IOException, ClassNotFoundException {
        listaRecuperada.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("infoPropietarios.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Propietario Propietario = new Propietario(values[0], values[1], values[2], values[3], values[4], Integer.parseInt(values[5]));
                listaRecuperada.add(Propietario);
            }
        }
    }
    
    @Override
    public void actualizarFichero(List<Propietario> lista)throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("infoPropietarios.csv"))) {
            for (Propietario obj : listaPropietarios) {
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(obj.getNombre())
                      .add(String.valueOf(obj.getId()))
                      .add(obj.getTelefono())
                      .add(obj.getCorreo())
                      .add(obj.getProfesion())
                      .add(obj.getOficio());
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
            
            PdfWriter.getInstance(doc, new FileOutputStream("Lista_de_Propietarios.pdf"));  //lo asociamos como archivo y colocarle nombre
            doc.open();
            Paragraph titulo = new Paragraph("Lista de Propietarios", tipo2);
            doc.add(titulo);
            for (Propietario Propietario : listaRecuperada){
                Paragraph txNom = new Paragraph("Nombre: " + Propietario.getNombre(), tipo1);
                Paragraph txId = new Paragraph("ID: " + Propietario.getId(), tipo1);
                Paragraph txTel = new Paragraph("Telefono: "+ Propietario.getTelefono(), tipo1);
                Paragraph txCor = new Paragraph("Correo: " + Propietario.getCorreo(), tipo1);
                Paragraph txProf = new Paragraph("Profesion: "+ Propietario.getProfesion(), tipo1);
                Paragraph txOf = new Paragraph("Oficio: "+ Propietario.getOficio(), tipo1);
                Paragraph txLinea = new Paragraph("------------------------------------------------------", tipo1);
                
                doc.add(txNom);
                doc.add(txId);
                doc.add(txTel);
                doc.add(txCor);
                doc.add(txProf);
                doc.add(txOf);
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
