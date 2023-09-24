package Fila;
public class Fila<T> extends EstruturaEstatica<T> {   

    public Fila () {
        super();
    }
    
    public Fila (int capacidade) {
        super(capacidade);
    }
    
    public void enfileira(T elemento) {
        super.adcionar(elemento);
    }
    
    public void enfileira(int posicao, T elemento) {
        super.adcionar(posicao, elemento);
    }

    public T espiar() {

        if (this.estaVavia()) {
            return null;
        }

        return this.elementos[0];
    }

    public T desemfileira() {

        final int POS = 0;

        if (this.estaVavia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];

        this.remove(POS);

        return elementoASerRemovido;
    }
    
}