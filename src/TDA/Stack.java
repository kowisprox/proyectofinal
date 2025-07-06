
package TDA;

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
