/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */
public class NodoExpediente {
    Expediente expediente;
    NodoExpediente siguiente;

    public NodoExpediente(Expediente expediente) {
        this.expediente = expediente;
        this.siguiente = null;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public NodoExpediente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoExpediente siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
