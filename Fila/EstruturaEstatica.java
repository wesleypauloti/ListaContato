package Fila;
public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaEstatica (int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica () {
        this(10);
    }

    public boolean estaVavia() {
        return this.tamanho == 0;
    } 

    protected boolean adcionar(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;  
            return true;          
        }
        return false;
    }
    
    protected boolean adcionar(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;  
        return true;       
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
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

    protected int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

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