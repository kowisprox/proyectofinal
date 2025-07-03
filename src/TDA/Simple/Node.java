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
