package Pilha;

import java.util.Stack;

public class Pilha_Stack {
    private Stack<String> pilha = new Stack<>();

    // Push adiciona um elemento no topo da pilha
    public void push(String elemento){
        pilha.push(elemento);
    }

    // Pop remove o elemento do topo da pilha
    public String pop(){
        if(!pilha.empty()){
            return pilha.pop();
        } else {
            return "Pilha está vazia";
        }
    }
    // Peek mostra o elemento do topo da pilha sem remove-lo
    public String peek(){
        if(!pilha.isEmpty()){
            return pilha.peek();
        } else {
            return "Pilha está vazia";
        }
    }

    // isEmpty verifica se a pilha esta vazia
    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public int search(String elemento){
        return pilha.search(elemento);
    }

    public static void main(String[] args) {
        Pilha_Stack pilha = new Pilha_Stack();

        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");
        System.out.println("Imprimendo a pilha: ");

        pilha.pilha.forEach(System.out::println);
        System.out.println("Removendo o elemento do topo da pilha: " + pilha.pop());

        System.out.println("Imprimindo a pilha: ");
        pilha.pilha.forEach(System.out::println);

        System.out.println("Elemento no topo da pilha: " + pilha.peek());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("Posição do Terceiro na pilha: " + pilha.search("Terceiro"));


    }
}
