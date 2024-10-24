/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades.propiedades;
import com.miguelav.conjuntohojasverdes.utilidades.propiedades.Propiedad;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class EspacioComun extends Propiedad{
    
    String horaInicio, horaCierre;
    double costoMantenimiento;
    int maxPersonas;
    ArrayList<String> diasServicio = new ArrayList<>();

    public EspacioComun() {
    }

    public EspacioComun(String horaInicio, String horaCierre, double costoMantenimiento, int maxPersonas, ArrayList<String> diasServicio, int identificacion, String descripcion, String direccion, String nombre) {
        super(identificacion, descripcion, direccion, nombre);
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.costoMantenimiento = costoMantenimiento;
        this.maxPersonas = maxPersonas;
        this.diasServicio = diasServicio;
    }

    

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public ArrayList<String> getDiasServicio() {
        return diasServicio;
    }

    public void setDiasServicio(ArrayList<String> diasServicio) {
        this.diasServicio = diasServicio;
    }

    @Override
    public int getIdentificacion() {
        return identificacion;
    }

    @Override
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "EspacioComun{" + "horaInicio=" + horaInicio + ", horaCierre=" + horaCierre + ", costoMantenimiento=" + costoMantenimiento + ", maxPersonas=" + maxPersonas + ", diasServicio=" + diasServicio + '}';
    }
    
}
