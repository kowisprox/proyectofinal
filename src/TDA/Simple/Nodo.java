
package TDA.Simple;

public class Nodo<T> {
    private Object value;
    private Nodo next;
    private Nodo prev;
    private Nodo left;
    private Nodo right;

    public Nodo(Object value) {
        this.value = value;
        this.next = null;
        this.prev = null;
        this.left = null;
        this.right = null;
    }

    public Object getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo getPrev() {
        return prev;
    }

    public Nodo getLeft() {
        return left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
    
}
