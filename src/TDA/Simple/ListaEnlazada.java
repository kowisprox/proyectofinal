package TDA.Simple;

public class ListaEnlazada {

    private Nodo L;

    public ListaEnlazada() {
        this.L = null;
    }

    public void addFirst(Object value) {
        Nodo newNode = new Nodo(value);
        newNode.setNext(L);
        L = newNode;
    }

    public void addLast(Object value) {
        Nodo newNode = new Nodo(value);
        if (L == null) {
            addFirst(value);
        } else {
            Nodo ptr = L;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(newNode);
        }
    }

    public void addBefore(Object item, Object ref) {
        Nodo newNode = new Nodo(item);

        if (L != null) {
            Nodo ptr = L;
            Nodo prev = null;
            while (ptr != null && !ptr.getValue().equals(ref)) {
                prev = ptr;
                ptr = ptr.getNext();
            }

            if (ptr != null) {
                if (prev == null) {
                    addFirst(item);
                } else {
                    prev.setNext(newNode);
                    newNode.setNext(ptr);
                }
            } else {
                System.out.println("No se encontró el valor de referencia.");
            }
        } else {
            System.out.println("Lista vacía, no existe valor de referencia.");
        }
    }

    public void removeFirst() {
        if (L != null) {
            L = L.getNext();
        }
    }

    public void removeLast() {
        if (L == null) return;

        if (L.getNext() == null) {
            removeFirst();
        } else {
            Nodo ptr = L;
            Nodo prev = null;
            while (ptr.getNext() != null) {
                prev = ptr;
                ptr = ptr.getNext();
            }
            if (prev != null) {
                prev.setNext(null);
            }
        }
    }

    public void remove(Object ref) {
        if (L == null) return;

        if (L.getValue().equals(ref)) {
            removeFirst();
        } else {
            Nodo ptr = L.getNext();
            Nodo prev = L;

            while (ptr != null && !ptr.getValue().equals(ref)) {
                prev = ptr;
                ptr = ptr.getNext();
            }
            if (ptr != null) {
                prev.setNext(ptr.getNext());
            }
        }
    }

    public void showElements() {
        Nodo ptr = L;
        while (ptr != null) {
            System.out.print(ptr.getValue() + " --> ");
            ptr = ptr.getNext();
        }
        System.out.println("null");
    }

    public int countElements() {
        int count = 0;
        Nodo ptr = L;
        while (ptr != null) {
            count++;
            ptr = ptr.getNext();
        }
        return count;
    }
    
    public String mostrarElementos() {
    StringBuilder sb = new StringBuilder();
    Nodo aux = L;

    while (aux != null) {
        sb.append(aux.getValue()).append("\n");
        aux = aux.getNext();
    }
    return sb.toString();
}

}
