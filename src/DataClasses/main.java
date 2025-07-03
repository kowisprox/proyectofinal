/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author nicol
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ColaExpedientes cola = new ColaExpedientes();
        Scanner sc = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar expediente");
            System.out.println("2. Atender expediente");
            System.out.println("3. Mostrar expedientes en cola");
            System.out.println("4. Agregar seguimiento a expediente");
            System.out.println("5. Ver seguimiento de un expediente");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            System.out.print("\nIngrese la opcion deseada (1,2,3,4,5,6): ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Prioridad: ");
                    String prio = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    Expediente exp = new Expediente(id, prio, dni, nom);
                    cola.encolar(exp);
                    System.out.println("Expediente registrado.");
                    break;
                case 2:
                    Expediente atendido = cola.desencolar();
                    if (atendido != null) {
                        System.out.println("Atendiendo expediente: " + atendido.getId());
                    } else {
                        System.out.println("No hay expedientes.");
                    }   break;
                case 3:
                    cola.mostrarExpedientes();
                    break;
                case 4:
                    System.out.print("ID del expediente a actualizar: ");
                    String idBuscar = sc.nextLine();
                    NodoExpediente actual = cola.getFrente();
                    boolean encontrado = false;
                    while (actual != null) {
                        if (actual.expediente.getId().equals(idBuscar)) {
                            System.out.print("Dependencia a registrar: ");
                            String dep = sc.nextLine();
                            String ahora = java.time.LocalDateTime.now().toString();
                            actual.expediente.agregarSeguimiento(dep, ahora);
                            System.out.println("Seguimiento agregado.");
                            encontrado = true;
                            break;
                        }
                        actual = actual.siguiente;
                    }
                    if (!encontrado) {
                        System.out.println("Expediente no encontrado.");
                    }
                    break;
                default:
                    break OUTER;
            }
        }
    }
}
