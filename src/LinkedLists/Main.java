package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adicionando elementos na lista em forma de pilha
/*        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");*/

        // Utilizando o método pop()
       // linkedList.pop(); // Remove o elemento do topo da pilha

       // System.out.println(linkedList);

        // Adicionando elementos na lista em forma de fila
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println(linkedList);

        // Utilizando o método poll()
        linkedList.poll(); // Remove o elemento do topo da fila

        linkedList.add(3, "E"); // Adiciona o elemento no indice 3
        linkedList.remove("B"); // Remove o elemento com o valor "B"
        System.out.println(linkedList.indexOf("F")); // Retorna o indice do elemento
        System.out.println(linkedList.peekFirst()); // Retorna o elemento do começo da fila
        System.out.println(linkedList.peekLast()); // Retorna o elemento do fim da fila

        System.out.println(linkedList);


    }
}
