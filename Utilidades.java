/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Paola
 */
public class Utilidades {
    static public Date sumarDias(int dias){
        DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        Date resultado, auxResultado = null;
        long longAux = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); 
        c.add(Calendar.DATE, dias); 
        resultado = c.getTime();
        System.out.println(forma.format(resultado)); 
        return resultado;
    }
    
    static public String dateToString(Date fecha){
        DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = forma.format(fecha);
        return fechaString; 
    }
    
    static public Date stringToDate(String fecha){
        DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaString = null;
        try {
            fechaString = forma.parse(fecha);
        } catch (ParseException ex) {
            System.out.println("Error al parsear.");
        }
        return fechaString; 
    }
}
