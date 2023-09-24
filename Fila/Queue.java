package Fila;
// import java.util.Queue;
import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<Integer> fila = new LinkedList<>();
        
        System.out.println(fila.isEmpty());
        fila.add(1);
        fila.add(2);
        System.out.println(fila.isEmpty());
        System.out.println(fila.peek());
        System.out.println(fila);
        System.out.println(fila.size());
        fila.remove();
        System.out.println(fila.size());
        System.out.println(fila);

    }

} 