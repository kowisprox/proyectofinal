
package DataManagers;

import TDA.Simple.Cola;
import DataClasses.*;
import TDA.Simple.*;

public class UserManager {
    private static LinkedList<UserData> users = new LinkedList<>();
    
    public Arbol ArbolDepend;
    public ListaEnlazadaDoble ListaExp;
    public Cola ColaPendientes;
    public ListaCircular ListaAlertas;

       public UserManager() {
        this.ArbolDepend = new Arbol();
        this.ListaExp = new ListaEnlazadaDoble();
        this.ColaPendientes = new Cola();
        this.ListaAlertas = new ListaCircular();
    }
    
    public UserManager(Arbol ArbolDepend, ListaEnlazadaDoble ListaExp, Cola ColaPendientes, ListaCircular ListaAlertas) {
        this.ArbolDepend = ArbolDepend;
        this.ListaExp = ListaExp;
        this.ColaPendientes = ColaPendientes;
        this.ListaAlertas = ListaAlertas;
    }
    
    // Registrar dependencia completa (id + nombre)
    public void registrarDependencia(int id, String nombre) {
        Dependencia dep = new Dependencia(id, nombre);
        ArbolDepend.insertar(dep);
    }

    public void registrarExpediente(Expediente exp) {
        ListaExp.addLast(exp);
        ColaPendientes.encolar(exp);
        ListaAlertas.addLast(exp);
    }

    public boolean buscarDependencia(int id) {
        return ArbolDepend.buscar(id);
    }

    public boolean buscarExpediente(int id) {
        return ListaExp.buscar(id);
    }

    public Expediente buscarExpedientePorId(int id) {
        return ListaExp.buscarPorId(id);
    }
    
    public Arbol getArbolDependencias() {
    return ArbolDepend;
    }

    public static void finalizarTramite(Expediente exp, String fechaFin) {
        exp.setFechaFin(fechaFin);
    }

    public static void registrarMovimiento(Expediente exp, String mensaje) {
    exp.getSeguirExp().addLast(mensaje);
        }

    public static void mostrarSeguimiento(Expediente exp) {
        System.out.println("Seguimiento del expediente ID " + exp.getId() + ":");
        exp.getSeguirExp().showElements();
    }

    public void mostrarAlertas() {
        System.out.println("Expedientes pendientes (por orden de llegada y prioridad):");
        ListaAlertas.showElements();
    }
    
    public static void initialize() {
        UserData user = new UserData("admin", "12345");
        users.addLast(user);
        
        System.out.println("UserManager data loaded!");
    }
    
    public static LinkedList<UserData> users() {
        return users;
    }
    
    public static void addUser(UserData userData) {
        users.addLast(userData);
    }
    
    public Expediente buscarPorID(int id) {
    TDA.Simple.NodoExpediente ptr = ListaExp.getFrente();
    while (ptr != null) {
        if (ptr.getExpediente().getId() == id) {
            return ptr.getExpediente();
            }
            ptr = ptr.getNext();
        }
        return null; 
    }
    
    public void finalizarExpediente(int id) {
    TDA.Simple.NodoExpediente ptr = ListaExp.getFrente();

    while (ptr != null) {
        if (ptr.getExpediente().getId() == id) {
            Expediente exp = ptr.getExpediente();
            exp.setDependenciaActual("Administrador");

            java.time.LocalDateTime now = java.time.LocalDateTime.now();
            String fechaFin = now.toLocalDate().toString(); 
            String horaFin = now.toLocalTime().withNano(0).toString(); 

            exp.setFechaFin(fechaFin);
            exp.setHoraFin(horaFin);
            
            exp.finalizarTramite();

            return;
            }
        ptr = ptr.getNext();
        }
    }
    
}
