package Fila;

public class Filas {

    public static void main(String[] args) {

        FilaPrioridade<Integer> fila = new FilaPrioridade<>(); 
        
        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        
        System.out.println(fila);
    }

} 