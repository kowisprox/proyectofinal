package TDA.Simple;

public class Cola<T> {
    private static final int MAX_SIZE = 50;
    private Object[] data;
    private int ini;
    private int fin;
    private int cantidad;

    public Cola() {
        data = new Object[MAX_SIZE];
        ini = 0;
        fin = -1;
        cantidad = 0;
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == MAX_SIZE;
    }

    public void encolar(T item) {
        if (isFull()) {
            System.out.println("Cola llena.");
            return;
        }
        fin = (fin + 1) % MAX_SIZE;
        data[fin] = item;
        cantidad++;
    }

    public T desencolar() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return null;
        }
        T item = (T) data[ini];
        ini = (ini + 1) % MAX_SIZE;
        cantidad--;
        return item;
    }
    
}
