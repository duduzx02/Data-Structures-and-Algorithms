package FilaDePrioridade;

import java.util.PriorityQueue;
import java.util.Queue;

public class TutoringAllocation {
    static class Student implements Comparable<Student> {
        String name;
        double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        @Override
        public int compareTo(Student o) {
            return Double.compare(o.gpa, this.gpa); // Ordem crescente
        }

        @Override
        public String toString() {
            return name + " (GPA: " + gpa + ")";
        }
    }

    public static void main(String[] args) {
        // criação de uma fila de prioridade para alunos
        Queue<Student> studentQueue = new PriorityQueue<>();

        // Adicionando estudantes a fila
        studentQueue.offer(new Student("Alice", 3.9));
        studentQueue.offer(new Student("Bob", 3.5));
        studentQueue.offer(new Student("Charlie", 4.0));
        studentQueue.offer(new Student("Diana", 3.7));

        // Alocando tutoriais para os alunos
        while(!studentQueue.isEmpty()){
            System.out.println("Alocando tutoria para o aluno : " + studentQueue.poll());
        }
    }
}
