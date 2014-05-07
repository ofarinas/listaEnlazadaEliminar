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
        lista.insertar(3);
        lista.insertar(6);
        lista.insertar(7);
       
        
        //System.out.println(lista.remove(4));
        Node nodeAux = lista.f;
        System.out.println("///////////////////////////////////");
         while (nodeAux != null) {
            System.out.println(nodeAux.dato);
            nodeAux=nodeAux.prev;
        }
    }
}
