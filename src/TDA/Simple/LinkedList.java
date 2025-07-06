/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA.Simple;

/**
 *
 * @author migue
 * @param <T>
 */
public class LinkedList<T> {
    private Node<T> L;

    public LinkedList() {
        this.L = null;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node(value);
        if (L == null) {
            newNode.setNext(null);
        } else {
            newNode.setNext(L);
        }

        L = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node(value);
        
        if (L == null) {
            addFirst(value);
        } 
        else {
            Node ptr = L;

            while (ptr.next() != null) {
                ptr = ptr.next();
            }
            
            ptr.setNext(newNode);
            newNode.setNext(null);
        }
    }

    public void addBefore(T item, T ref) {
        Node<T> newNode = new Node(item);

        if (L != null) {
            Node ptr = L;
            Node prev = null;
            
            while (ptr != null && ptr.item() != ref) {
                prev = ptr;
                ptr = ptr.next();
            } 

            if (ptr != null) {
                if (prev == null) {
                    addFirst(item);
                } 
                else {
                    prev.setNext(newNode);
                    newNode.setNext(ptr);
                }
            } 
            else {
                System.out.println("No se encontro el valor de referencia");
            }
        } 
        else {
            System.out.println("Lista vacia, no existe valor de referencia");
        }
    }

    public void removeFirst() {
        if (L != null) {
            L = (Node<T>) L.next();
        }
    }

    public void removeLast() {
        Node ptr = L;
        Node prev = null;
        if (ptr != null) {
            while (ptr.next() != null) {
                prev = ptr;
                ptr = ptr.next();
            }
            if (prev == null) {
                removeFirst();
            } 
            else {
                prev.setNext(null);
            }
        }
    }

    public void remove(T ref) {
        if (L != null) {
            if (L.item() == ref) {
                removeFirst();
            } else {
                Node ptr = L.next();
                Node prev = L;

                while (ptr != null && ptr.item() != ref) {
                    prev = ptr;
                    ptr = ptr.next();
                }
                if (ptr != null) {
                    prev.setNext(ptr.next());
                }
            }
        }
    }

    public void showElements() {
        Node ptr = L;

        while (ptr != null) {
            System.out.print(ptr.item() + " --> ");
            ptr = ptr.next();
        }

        System.out.println("null");
    }

    public int countElements() {
        int count = 0;
        Node ptr = L;
        
        while (ptr != null) {
            count++;
            ptr = ptr.next();
        }
        
        System.out.println("Count: " + count);
        return count;
    }

    public Node L() {
        return L;
    }
}
