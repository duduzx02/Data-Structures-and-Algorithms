package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // verifica se a fila está vazia
        System.out.println("A fila está vazia? " + queue.isEmpty());

        // Adiciona elementos na fila (nome de pessoas)
        queue.offer("Karen");
        queue.offer("Lucas");
        queue.offer("Pedro");
        queue.offer("Maria");
        queue.offer("Joaquim");

        // Retorna o tamanho da fila
        System.out.println("Tamanho da fila: " + queue.size());

        // Verificar se existe um determiado elemento na fila
        System.out.println("Existe o elemento em questaão na fila? " + queue.contains("Pedro"));

        // Exibe os elementos da fila
        System.out.println("Elementos da fila: " + queue);

        // Espia o primeiro elemento da fila
        System.out.println("Primeiro elemento da fila: " + queue.peek());

        // Desenfileirando os elemtos
        while(!queue.isEmpty()){
            System.out.println("Atendendo... " + queue.poll());
        }

        // Exibe os elementos da fila
        System.out.println("Elementos da fila: " + queue);

        // Verificando se a lista está vazia
        System.out.println("A fila está vazia? " + queue.isEmpty());

        // ! O ponto positivo de se usar o pull ao inves do add é que não tem exceção de pilha vazia
    }
}
