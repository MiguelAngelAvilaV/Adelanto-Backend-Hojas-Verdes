/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelav.conjuntohojasverdes.utilidades;
import com.miguelav.conjuntohojasverdes.utilidades.personas.Propietario;
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
public class Factura {
    Date fechaFactura, fechaMaxPago, fechaPago = Calendar.getInstance().getTime();
    Propiedad propiedadFacturada;
    Propietario propietarioFacturado;
    double valorMetros2, valorPagar, valorCuentasVencidas, valorMultas, descuentos, otrosCargos, totalPagar, valorPagado;
    String infoPago;

    public Factura() {
    }

    public Factura(Propiedad propiedadFacturada, Propietario propietarioFacturado, double valorMetros2, double valorPagar, double valorCuentasVencidas, double valorMultas, double descuentos, double otrosCargos, double totalPagar, double valorPagado, String infoPago) {
        this.fechaFactura = Calendar.getInstance().getTime();
        this.fechaMaxPago = Utilidades.sumarDias(30);
        this.propiedadFacturada = propiedadFacturada;
        this.propietarioFacturado = propietarioFacturado;
        this.valorMetros2 = valorMetros2;
        this.valorPagar = valorPagar;
        this.valorCuentasVencidas = valorCuentasVencidas;
        this.valorMultas = valorMultas;
        this.descuentos = descuentos;
        this.otrosCargos = otrosCargos;
        this.totalPagar = totalPagar;
        this.valorPagado = valorPagado;
        this.infoPago = infoPago;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaMaxPago() {
        return fechaMaxPago;
    }

    public void setFechaMaxPago(Date fechaMaxPago) {
        this.fechaMaxPago = fechaMaxPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Propiedad getPropiedadFacturada() {
        return propiedadFacturada;
    }

    public void setPropiedadFacturada(Propiedad propiedadFacturada) {
        this.propiedadFacturada = propiedadFacturada;
    }

    public double getValorMetros2() {
        return valorMetros2;
    }

    public void setValorMetros2(double valorMetros2) {
        this.valorMetros2 = valorMetros2;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getValorCuentasVencidas() {
        return valorCuentasVencidas;
    }

    public void setValorCuentasVencidas(double valorCuentasVencidas) {
        this.valorCuentasVencidas = valorCuentasVencidas;
    }

    public double getValorMultas() {
        return valorMultas;
    }

    public void setValorMultas(double valorMultas) {
        this.valorMultas = valorMultas;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getOtrosCargos() {
        return otrosCargos;
    }

    public void setOtrosCargos(double otrosCargos) {
        this.otrosCargos = otrosCargos;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public String getInfoPago() {
        return infoPago;
    }

    public void setInfoPago(String infoPago) {
        this.infoPago = infoPago;
    }

    public Propietario getPropietarioFacturado() {
        return propietarioFacturado;
    }

    public void setPropietarioFacturado(Propietario propietarioFacturado) {
        this.propietarioFacturado = propietarioFacturado;
    }

    @Override
    public String toString() {
        return "Factura{" + "fechaFactura=" + fechaFactura + ", fechaMaxPago=" + fechaMaxPago + ", fechaPago=" + fechaPago + ", propiedadFacturada=" + propiedadFacturada + ", propietarioFacturado=" + propietarioFacturado + ", valorMetros2=" + valorMetros2 + ", valorPagar=" + valorPagar + ", valorCuentasVencidas=" + valorCuentasVencidas + ", valorMultas=" + valorMultas + ", descuentos=" + descuentos + ", otrosCargos=" + otrosCargos + ", totalPagar=" + totalPagar + ", valorPagado=" + valorPagado + ", infoPago=" + infoPago + '}';
    }

}
