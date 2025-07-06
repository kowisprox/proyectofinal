package TDA.Simple;

public class ListaEnlazada<T> {

    private Node<T> L;

    public ListaEnlazada() {
        this.L = null;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(L);
        L = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (L == null) {
            addFirst(value);
        } else {
            Node<T> ptr = L;
            while (ptr.next() != null) {
                ptr = ptr.next();
            }
            ptr.setNext(newNode);
        }
    }

    public void removeFirst() {
        if (L != null) {
            L = L.next();
        }
    }

    public void removeLast() {
        if (L == null) return;

        if (L.next() == null) {
            removeFirst();
        } else {
            Node<T> ptr = L;
            Node<T> prev = null;
            while (ptr.next() != null) {
                prev = ptr;
                ptr = ptr.next();
            }
            if (prev != null) {
                prev.setNext(null);
            }
        }
    }

    public void remove(T ref) {
        if (L == null) return;

        if (L.item().equals(ref)) {
            removeFirst();
        } else {
            Node<T> ptr = L.next();
            Node<T> prev = L;

            while (ptr != null && !ptr.item().equals(ref)) {
                prev = ptr;
                ptr = ptr.next();
            }
            if (ptr != null) {
                prev.setNext(ptr.next());
            }
        }
    }

    public void vaciar() {
        L = null;
    }

    public int countElements() {
        int count = 0;
        Node<T> ptr = L;
        while (ptr != null) {
            count++;
            ptr = ptr.next();
        }
        return count;
    }

    public void showElements() {
        Node<T> ptr = L;
        while (ptr != null) {
            System.out.print(ptr.item() + " --> ");
            ptr = ptr.next();
        }
        System.out.println("null");
    }

    public String mostrarElementos() {
        StringBuilder sb = new StringBuilder();
        Node<T> aux = L;
        while (aux != null) {
            sb.append(aux.item()).append("\n");
            aux = aux.next();
        }
        return sb.toString();
    }

    public Node<T> getFrente() {
        return L;
    }

    public Node<T> L() {
        return L;
    }
}