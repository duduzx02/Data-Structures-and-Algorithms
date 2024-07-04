package Pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println("A pilha está vazia? " + stack.empty()); // Verifica se a pilha esta vazia
        // Adiciona elementos na pilha
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println("A pilha está vazia? " + stack.empty()); // Verifica se a pilha esta vazia

        // Imprime os elementos da pilha
        System.out.println("Elementos da pilha: " + stack);

        // Remove um elemento da stack
        System.out.println("Elemento removido: " + stack.pop());
        System.out.println("Elementos da pilha: " + stack);

        // Se remover todos os elementos da stack vai gerar uma exceção de pilha vazia

        // Retorna o elemento do topo sem remover
        System.out.println("Elemento do topo: " + stack.peek());

        // Retorna o tamanho da pilha
        System.out.println("Tamanho da pilha: " + stack.size());

        // Retorna o o indice do elemento
        System.out.println("Indice do elemento: " + stack.search("D"));
        // Se o elemento não existir vai retornar -1
        // Se adicionarmos um bilão de elementos em uma pilha irá gerar uma exceção de pilha cheia

    }
}
