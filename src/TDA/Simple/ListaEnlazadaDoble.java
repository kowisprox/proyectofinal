package TDA.Simple;

import DataClasses.Expediente;

public class ListaEnlazadaDoble {

    public NodoExpediente head, tail;

    public ListaEnlazadaDoble() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(Expediente exp) {
        NodoExpediente newNode = new NodoExpediente(exp);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void showForward() {
        NodoExpediente ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getExpediente().getId() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.println("null");
    }

    public boolean buscar(int id) {
        NodoExpediente ptr = head;
        while (ptr != null) {
            if (ptr.getExpediente().getId() == id) {
                return true; // Ya existe un expediente con ese ID
            }
            ptr = ptr.getNext();
        }
        return false; // No se encontró el ID
    }
    
    
    public Expediente buscarPorId(int id) {
    NodoExpediente actual = head;

    while (actual != null) {
        if (actual.getExpediente().getId() == id) {
            return actual.getExpediente();
        }
        actual = actual.getNext();
    }
    return null; // No encontrado
}
    
    public NodoExpediente getFrente() {
    return head;
}


}
