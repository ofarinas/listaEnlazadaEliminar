/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import lista.ListaEnlazadas.Node;

/**
 *
 * @author pcn03
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadas lista = new ListaEnlazadas();
   lista.insertar(4);
   
        
        System.out.println(lista.eliminar(4));
    // lista.rellenar();
     Node nodeAux = lista.root;
        System.out.println("///////////////////////////////////");
         while (nodeAux != null) {
            System.out.println(nodeAux.dato);
            nodeAux=nodeAux.next;
        }
    }
}
