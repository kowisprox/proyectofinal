/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import TDA.Simple.ListaEnlazada;

/**
 *
 * @author nicol
 */
public class Expediente {
    private int Id;
    private int Prioridad;
    private DataInteresado Data;
    private String Asunto;
    private String DocumentoReferencia;
    private String FechaInicio;
    private String FechaFin;
    private ListaEnlazada SeguirExp;
    private Dependencia dependencia;
    private String DependenciaActual;

    public Expediente(int Id, int Prioridad, DataInteresado Data, String Asunto, String DocumentoReferencia, String FechaInicio, String dependencia) {
        this.Id = Id;
        this.Prioridad = Prioridad;
        this.Data = Data;
        this.Asunto = Asunto;
        this.DocumentoReferencia = DocumentoReferencia;
        this.FechaInicio = FechaInicio;
        this.SeguirExp = new ListaEnlazada();
        this.DependenciaActual = dependencia;
        
    }

    public String getDependenciaActual() {
        return DependenciaActual;
    }

    public void setDependenciaActual(String DependenciaActual) {
        this.DependenciaActual = DependenciaActual;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }

    public DataInteresado getData() {
        return Data;
    }

    public void setData(DataInteresado Data) {
        this.Data = Data;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getDocumentoReferencia() {
        return DocumentoReferencia;
    }

    public void setDocumentoReferencia(String DocumentoReferencia) {
        this.DocumentoReferencia = DocumentoReferencia;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public ListaEnlazada getSeguirExp() {
        return SeguirExp;
    }

    public void setSeguirExp(ListaEnlazada Seguimiento) {
        this.SeguirExp = Seguimiento;
    }

    

    }
