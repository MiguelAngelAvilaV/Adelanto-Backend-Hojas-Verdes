/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades.propiedades;

import com.miguelav.conjuntohojasverdes.utilidades.propiedades.Propiedad;
import com.miguelav.conjuntohojasverdes.utilidades.personas.Propietario;

/**
 *
 * @author Paola
 */
public class Casa extends Propiedad{
    
    double saldoActual, metros2;
    Propietario propietario;

    public Casa() {
    }

    public Casa(double saldoActual, double metros2, Propietario propietario, int identificacion, String descripcion, String direccion, String nombre) {
        super(identificacion, descripcion, direccion, nombre);
        this.saldoActual = saldoActual;
        this.metros2 = metros2;
        this.propietario = propietario;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getMetros2() {
        return metros2;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
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
        return "Casa{" + "saldoActual=" + saldoActual + ", metros2=" + metros2 + ", propietario=" + propietario + '}';
    }
    
}
