

package TDA.Simple;

import DataClasses.Expediente;

public class ListaCircular {
    private NodoExpediente head;

    public ListaCircular() {
        this.head = null;
    }

    public void addLast(Expediente exp) {
        NodoExpediente newNode = new NodoExpediente(exp);
        if (head == null) {
            head = newNode;
            newNode.setNext(head);
        } else {
            NodoExpediente ptr = head;
            while (ptr.getNext() != head) {
                ptr = ptr.getNext();
            }
            ptr.setNext(newNode);
            newNode.setNext(head);
        }
    }

    public void showElements() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoExpediente ptr = head;
        do {
            System.out.print(ptr.getExpediente().getId() + " -> ");
            ptr = ptr.getNext();
        } while (ptr != head);
        System.out.println("...");
    }
}

