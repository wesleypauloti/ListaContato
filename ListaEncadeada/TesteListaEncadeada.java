package ListaEncadeada;
import java.util.Scanner;

public class TesteListaEncadeada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();    

        lista.adciona(1);

        System.out.println(lista);
        System.out.println(lista.getTamanho());
        
        lista.adciona(2);
        lista.adciona(3);
        
        System.out.println(lista);
        System.out.println(lista.getTamanho());
        lista.limpa();
        System.out.println(lista);

    }

} 