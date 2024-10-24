/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades.personas;
import com.miguelav.conjuntohojasverdes.utilidades.personas.Persona;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Paola
 */
public class Empleado extends Persona{
    
    String cargo;
    Date fechaInicio;
    
    public Empleado() {
    }

    public Empleado(String cargo, String nombre, int identificacion) {
        super(nombre, identificacion);
        this.cargo = cargo;
        this.fechaInicio = Calendar.getInstance().getTime();
    }

    public Empleado(String cargo, Date fechaInicio, String nombre, int id) {
        super(nombre, id);
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }    

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleados{" + "cargo=" + cargo + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
}
