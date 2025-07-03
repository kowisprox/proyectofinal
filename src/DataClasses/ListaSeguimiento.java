/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */
public class ListaSeguimiento {
    private NodoSeguimiento cabeza;

    public ListaSeguimiento() {
        cabeza = null;
    }

    public void agregarEvento(String dependencia, String timestamp) {
        NodoSeguimiento nuevo = new NodoSeguimiento(dependencia, timestamp);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSeguimiento actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarSeguimiento() {
        NodoSeguimiento actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dependencia + " - " + actual.FechayHora);
            actual = actual.siguiente;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
}
