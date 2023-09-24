package Fila;
// import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuePriority {

    public static void main(String[] args) {

        java.util.Queue<Paciente> fila = new PriorityQueue<Paciente>();
        
        System.out.println(fila.isEmpty());
        fila.add(new Paciente("A", 2));
        fila.add(new Paciente("C", 1));
        fila.add(new Paciente("B", 3));
        System.out.println(fila.isEmpty());
        System.out.println(fila.peek());
        System.out.println(fila);
        System.out.println(fila.size());
        fila.remove();
        System.out.println(fila.size());
        System.out.println(fila);

    }

} 