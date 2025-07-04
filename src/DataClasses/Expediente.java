/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */
public class Expediente {
    private int id;
    private int prioridad;
    private DataInteresado data;
    private String asunto;
    private String documentoReferencia;
    private ListaSeguimiento seguimiento;

    public Expediente(int id, int prioridad, DataInteresado data, String asunto, String documentoReferencia, ListaSeguimiento seguimiento) {
        this.id = id;
        this.prioridad = prioridad;
        this.data = data;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.seguimiento = seguimiento;
    }

    
    
    public void agregarSeguimiento(String dependencia, String timestamp) {
        seguimiento.agregarEvento(dependencia, timestamp);
    }

    public void mostrarSeguimiento() {
        System.out.println("Seguimiento del expediente " + id + ":");
        seguimiento.mostrarSeguimiento();
    }

    public int getId() { 
        return id;
        }
    public int getPrioridad() { 
        return prioridad; 
        }

    public DataInteresado getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setData(DataInteresado data) {
        this.data = data;
    }

    public ListaSeguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(ListaSeguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }
    
}
