package Pilha;
public class Pilha<T> extends EstruturaEstatica<T> {   

    public Pilha () {
        super();
    }
    
    public Pilha (int capacidade) {
        super(capacidade);
    }
    
    public void empilha(T elemento) {
        super.adcionar(elemento);
    }

    protected boolean adcionar(T elemento) {
        return super.adcionar(elemento);
    }

    public boolean adcionar(int posicao, T elemento) {
        return super.adcionar(posicao, elemento);
    }

    public T topo() {

        if (this.estaVavia()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilha() {

        if (this.estaVavia()) {
            return null;
        }

        return this.elementos[--tamanho];
    }
    
}