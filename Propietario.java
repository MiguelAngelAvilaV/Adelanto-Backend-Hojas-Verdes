/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades.personas;

import com.miguelav.conjuntohojasverdes.utilidades.personas.Persona;

/**
 *
 * @author Paola
 */
public class Propietario extends Persona{
    String telefono, correo, profesion, oficio;

    public Propietario() {
    }

    public Propietario(String telefono, String correo, String profesion, String oficio, String nombre, int identificacion) {
        super(nombre, identificacion);
        this.telefono = telefono;
        this.correo = correo;
        this.profesion = profesion;
        this.oficio = oficio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
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
        return "Propietarios{" + "telefono=" + telefono + ", correo=" + correo + ", profesion=" + profesion + ", oficio=" + oficio + '}';
    }
    
}
