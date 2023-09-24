package Fila;
public class FilaPrioridade<T> extends Fila<T> {   

    public void enfileira(T elemento) {

       Comparable<T> chave = (Comparable<T>) elemento;

       int i;
       for (i = 0; i < tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adcionar(i, elemento);

    }
    
}