package Vetor;
public class Aula03 {

    public static void main(String[] args) {
        
        VetorObject vetor = new VetorObject(3);
    
        vetor.adcionar(3);
        vetor.adcionar(4);
        vetor.adcionar(5);
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
} 