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

    public int eliminar(int elemento) {
        Node aux = root;
        int count = 0;
        while (aux != null) {
            if (elemento == aux.dato) {
                if (aux == root) {
                    root = root.next;
                } else {
                    aux.prev.next = aux.next;
                    if(aux.next!=null)
                    aux.next.prev = aux;
                }
                count++;
            }
            aux = aux.next;
        }
        return count;
    }

   
}
