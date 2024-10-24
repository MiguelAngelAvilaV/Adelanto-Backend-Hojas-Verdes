/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades.propiedades;

/**
 *
 * @author Paola
 */
public class Propiedad {
    String descripcion, direccion, nombre;
    int identificacion;
    
    public Propiedad() {
    }

    public Propiedad(int identificacion, String descripcion, String direccion, String nombre) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "descripcion=" + descripcion + ", direccion=" + direccion + ", nombre=" + nombre + ", identificacion=" + identificacion + '}';
    }
        
}
