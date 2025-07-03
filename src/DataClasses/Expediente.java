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
    private String id;
    private String prioridad;
    private String dni;
    private String nombre;
    private ListaSeguimiento seguimiento;

    public Expediente(String id, String prioridad, String dni, String nombre) {
        this.id = id;
        this.prioridad = prioridad;
        this.dni = dni;
        this.nombre = nombre;
        this.seguimiento = new ListaSeguimiento();
    }

    public void agregarSeguimiento(String dependencia, String timestamp) {
        seguimiento.agregarEvento(dependencia, timestamp);
    }

    public void mostrarSeguimiento() {
        System.out.println("Seguimiento del expediente " + id + ":");
        seguimiento.mostrarSeguimiento();
    }

    public String getId() { 
        return id;
        }
    public String getPrioridad() { 
        return prioridad; 
        }
    public String getDni() {
        return dni; 
        }
    public String getNombre() {
        return nombre;
        }
}
