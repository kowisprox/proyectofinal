package TDA.Simple;

import DataClasses.Dependencia;

public class Arbol {

    private Nodo root;

    public Arbol() {
        this.root = null;
    }

    public void insertar(Dependencia dep) {
        root = insertarRec(root, dep);
    }

    private Nodo insertarRec(Nodo root, Dependencia dep) {
        if (root == null) {
            return new Nodo(dep);
        }
        Dependencia actual = (Dependencia) root.getValue();
        if (dep.getId() < actual.getId()) {
            root.setLeft(insertarRec(root.getLeft(), dep));
        } else {
            root.setRight(insertarRec(root.getRight(), dep));
        }
        return root;
    }

    public boolean buscar(int id) {
        return buscarRec(root, id);
    }

    private boolean buscarRec(Nodo root, int id) {
        if (root == null) {
            return false;
        }
        Dependencia actual = (Dependencia) root.getValue();
        if (actual.getId() == id) {
            return true;
        }
        if (id < actual.getId()) {
            return buscarRec(root.getLeft(), id);
        } else {
            return buscarRec(root.getRight(), id);
        }
    }

    public void inOrdenCombo(javax.swing.JComboBox<String> combo) {
        inOrdenComboRec(root, combo);
    }

    private void inOrdenComboRec(Nodo root, javax.swing.JComboBox<String> combo) {
        if (root != null) {
            inOrdenComboRec(root.getLeft(), combo);
            Dependencia dep = (Dependencia) root.getValue();
            combo.addItem(dep.getId() + " - " + dep.getNombre());
            inOrdenComboRec(root.getRight(), combo);
        }
    }

}
