package lista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pcn03
 */
public class ListaEnlazadas {

    public class Node {

        int dato;
        Node next;
        Node prev;
    }
    Node root = null;
    Node f = null;

    public void insertar(int e) {
        Node node = new Node();
        node.dato = e;
        node.next = root;
        node.prev = null;
        if (root != null) {
            root.prev = node;
        }
        if (root == null) {
            f = node;
        }
        root = node;
    }
//rellenar una lista los valores que faltan

    public void rellenar() {
        Node aux = root;
        while (aux != null) {
            if (aux.next != null) {
                if ((aux.dato + 1) < aux.next.dato) {
                    Node temp = new Node();
                    temp.dato = aux.dato + 1;
                    temp.next = aux.next;
                    aux.next = temp;
                }
            }
            aux = aux.next;
        }

    }
// invierte los valores deuna lista 
    public ListaEnlazadas invertir() {
        ListaEnlazadas enlazadas = new ListaEnlazadas();
        Node aux = root;
        while (aux != null) {
            insertarSimple(aux.dato,enlazadas);
            aux = aux.next;
        }
        return enlazadas;
    }
//método que inserta por la cabecera 

    public void insertarSimple(int e,ListaEnlazadas enlazadas) {
        Node aux = new Node();
        aux.dato = e;
        aux.next = enlazadas.root;
       enlazadas.root = aux;
    }

    public int eliminar(int elemento) {
        Node aux = root;
        int count = 0;
        while (aux != null) {
            if (elemento == aux.dato) {
                if (aux == root) {
                    root = root.next;
                } else {
                    aux.prev.next = aux.next;
                    if (aux.next != null) {
                        aux.next.prev = aux;
                    }
                }
                count++;
            }
            aux = aux.next;
        }
        return count;
    }
}
