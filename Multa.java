/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades;

import com.miguelav.conjuntohojasverdes.utilidades.personas.Propietario;
import com.miguelav.conjuntohojasverdes.utilidades.propiedades.EspacioComun;
import com.miguelav.conjuntohojasverdes.utilidades.propiedades.Propiedad;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Paola
 */
public class Multa {
    Date fechaMulta, fechaEventoMulta, fechaMaxPago = Calendar.getInstance().getTime();
    String idMulta, descripcionEvento, evento, pruebas;
    EspacioComun lugarEvento;
    Propiedad propiedadMultada;
    Propietario propietarioMultado;
    double valorMulta;
    
    public Multa() {
    }

    public Multa(Date fechaEventoMulta, String idMulta, String descripcionEvento, String evento, String pruebas, EspacioComun lugarEvento, Propiedad propiedadMultada, Propietario propietarioMultado, double valorMulta) {
        this.fechaMulta = Calendar.getInstance().getTime();
        this.fechaEventoMulta = fechaEventoMulta;
        this.fechaMaxPago = Utilidades.sumarDias(30);
        this.idMulta = idMulta;
        this.descripcionEvento = descripcionEvento;
        this.evento = evento;
        this.pruebas = pruebas;
        this.lugarEvento = lugarEvento;
        this.propiedadMultada = propiedadMultada;
        this.propietarioMultado = propietarioMultado;
        this.valorMulta = valorMulta;
    }

    public Date getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public Date getFechaEventoMulta() {
        return fechaEventoMulta;
    }

    public void setFechaEventoMulta(Date fechaEventoMulta) {
        this.fechaEventoMulta = fechaEventoMulta;
    }

    public Date getFechaMaxPago() {
        return fechaMaxPago;
    }

    public void setFechaMaxPago(Date fechaMaxPago) {
        this.fechaMaxPago = fechaMaxPago;
    }

    public String getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(String idMulta) {
        this.idMulta = idMulta;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public EspacioComun getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(EspacioComun lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public Propiedad getPropiedadMultada() {
        return propiedadMultada;
    }

    public void setPropiedadMultada(Propiedad propiedadMultada) {
        this.propiedadMultada = propiedadMultada;
    }

    public Propietario getPropietarioMultado() {
        return propietarioMultado;
    }

    public void setPropietarioMultado(Propietario propietarioMultado) {
        this.propietarioMultado = propietarioMultado;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getPruebas() {
        return pruebas;
    }

    public void setPruebas(String pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public String toString() {
        return "Multa{" + "fechaMulta=" + fechaMulta + ", fechaEventoMulta=" + fechaEventoMulta + ", fechaMaxPago=" + fechaMaxPago + ", idMulta=" + idMulta + ", descripcionEvento=" + descripcionEvento + ", evento=" + evento + ", pruebas=" + pruebas + ", lugarEvento=" + lugarEvento + ", propiedadMultada=" + propiedadMultada + ", propietarioMultado=" + propietarioMultado + ", valorMulta=" + valorMulta + '}';
    }
    
}
