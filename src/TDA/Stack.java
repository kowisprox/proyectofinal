/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author migue
 */
public class Stack<T> {
    private T[] data;
    private int top;
    
    private static final int MAX_SIZE = 100;
    
    public Stack() {
        data = (T[]) new Object[MAX_SIZE];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top + 1 == MAX_SIZE;
    }
    
    public void push(T item) {
        if (isFull()) return;
        
        top++;
        data[top] = item;
    }
    
    public T pop() {
        if (isEmpty()) return null;
        
        T item = data[top];
        top--;
        
        return item;
    }
}
