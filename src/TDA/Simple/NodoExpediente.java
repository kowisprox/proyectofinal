

package TDA.Simple;

import DataClasses.Expediente;

public class NodoExpediente {
    private Expediente expediente;
    private NodoExpediente next, prev;

    public NodoExpediente(Expediente expediente) {
        this.expediente = expediente;
        this.next = null;
        this.prev = null;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public NodoExpediente getNext() {
        return next;
    }

    public void setNext(NodoExpediente next) {
        this.next = next;
    }

    public NodoExpediente getPrev() {
        return prev;
    }

    public void setPrev(NodoExpediente prev) {
        this.prev = prev;
    }
}