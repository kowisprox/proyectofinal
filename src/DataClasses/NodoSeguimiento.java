/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */
public class NodoSeguimiento {
    String dependencia;
    String FechayHora;
    NodoSeguimiento siguiente;

    public NodoSeguimiento(String dependencia, String timestamp) {
        this.dependencia = dependencia;
        this.FechayHora = timestamp;
        this.siguiente = null;
    }
}
