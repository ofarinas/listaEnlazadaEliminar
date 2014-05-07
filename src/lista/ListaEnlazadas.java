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
    Node f=null;

    public void insertar(int e) {
        Node node = new Node();
        node.dato = e;
        node.next = root;
        node.prev = null;
        if (root != null) {
            root.prev = node;
        }
        if(root==null) f=node;

        root = node;
    }

    public int remove(int numero) {
        Node aux = root;
        int count = 0;
        while (aux != null) {
            if (numero == aux.dato) {
                if (aux.next == null) {
                    aux = null;
                    count++;
                    break;
                } else {
                    if (aux.prev == null) {
                        root = root.next;
                    } else {
                        aux.next.prev = aux;
                        aux.prev.next = aux.next;
                    }
                }
                count++;
            }
            aux = aux.next;
        }

        return count;
    }
}
