/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */

public class ColaExpedientes {
    private NodoExpediente frente;
    private NodoExpediente fin;

    public ColaExpedientes() {
        frente = fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Expediente exp) {
        NodoExpediente nuevo = new NodoExpediente(exp);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Expediente desencolar() {
        if (!estaVacia()) {
            Expediente dato = frente.expediente;
            frente = frente.siguiente;
            if (frente == null) fin = null;
            return dato;
        }
        return null;
    }

    public void mostrarExpedientes() {
        NodoExpediente actual = frente;
        while (actual != null) {
            System.out.println("ID: " + actual.expediente.getId() + " - Prioridad: " + actual.expediente.getPrioridad());
            actual = actual.siguiente;
        }
    }

public NodoExpediente getFrente() {
    return frente;
    }
}
