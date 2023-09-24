package Vetor;
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista (int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public boolean adcionar(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;  
            return true;          
        } else {
           return false;
        }
    }
    
    public boolean adcionar(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;  
        return false;       
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public Object buscar(int posicao) {   
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }     
        return this.elementos[posicao];
    }
    
    public int buscar(T elemento) {   
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {                
                return i;
            } 
        }
        System.out.println("Elemento não consta no vetor");
        return -1;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }  
        for (int i = posicao; i < elementos.length - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("\n[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }  
}