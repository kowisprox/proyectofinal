
package TDA.Simple;

public class Node<T> {
    private final T item;
    private Node<T> next;
    
    public Node(T item) {
        this.item = item;
        next = null;
    }
    
    public T item() {
        return item;
    }
    
    public Node<T> next() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
