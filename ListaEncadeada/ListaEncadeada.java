package ListaEncadeada;
public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (tamanho == 0) {
            inicio = celula;
        } else {
            ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        tamanho++;
    }    

    public int getTamanho() {
        return tamanho;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        inicio = null;
        ultimo = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        
        if (tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = inicio;
        builder.append(atual.getElemento());
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(", ").append(atual.getElemento());
        }
        builder.append(']');

        return builder.toString();
    }
    
}