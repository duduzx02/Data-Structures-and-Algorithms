package FilaDePrioridade;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaDePrioridade {
    public static void main(String[] args) {
        /*
        // Criando uma fila de prioridades para GPAs de estudantes
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // Adicionando GPAs à fila de prioridades
        queue.offer(2.5);
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(2.0);

        // Imprimindo os GPAs da fila de prioridade

        // Exibindo e removendo elementos da fila de prioridades
        while(!queue.isEmpty()){
            System.out.println("GPAs da fila de prioridade: " + queue);
            System.out.println("GPA removido: " + queue.poll());
        }
*/

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("Aren");
        stringQueue.offer("Lucas");
        stringQueue.offer("Pedro");
        stringQueue.offer("Maria");
        stringQueue.offer("Joaquim");

        while(!stringQueue.isEmpty()){
            System.out.println("Elementos da fila: " + stringQueue);
            System.out.println("Elemento removido: " + stringQueue.poll());
        }





    }
}
