package Vetor;
import java.util.Scanner;

public class ListaContato {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Lista<Contato> lista = new Lista<>(20);    

        // criarContatosDinamicamente(5, lista);

        int opcao = 1;
        
        while (opcao != 0) {
            
            opcao =obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    AdcionarContato(scan, lista);
                    break;
                case 2:
                    obtemContato(scan, lista);
                    break;
                // case 3:
                //     AdcionarContato(scan, lista);
                //     break;
                case 4:
                    excluirContato(scan, lista);
                    break;
                case 5:
                    System.out.println("Numero de contatos na lista: " + lista.tamanho());
                    break;
                case 6:
                    lista = new Lista<>(20);
                    System.out.println("Todos os contatos foram excluidos");
                    break;
                case 7:
                    System.out.println(lista);
                    break;
                case 0:
                    System.out.println("Você digitou 0, programa encerrado");;
                    break;
            
                default:
                    break;
            }
        }
        
        System.out.println("\n\n");
    }

    public static void obtemContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Digite a posição do contato: ", scan);
        
        try {
            Contato contato = (Contato) lista.buscar(pos);

            System.out.println("Contato encontrado");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente");
        }

    }

    public static void excluirContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Digite a posição do contato a ser removida: ", scan);
        
        try {

            Contato contato = (Contato) lista.buscar(pos);

            lista.remove(pos);

            System.out.println("Contato excluido" + contato);
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente");
        }

    }

    public static void AdcionarContato(Scanner scan, Lista<Contato> lista) {
        
        String nome = lerInformacao("Nome: ", scan);
        String telefone = lerInformacao("Telefone: ", scan);
        String email = lerInformacao("email: ", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adcionar(contato);

        System.out.println("Contato adcionado com sucesso");
        System.out.println(contato);        
    }

    private static String lerInformacao(String msg, Scanner scan) {
        
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }
   
    private static int lerInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("\nDigite a opção desejada:\n");
            System.out.println("1: Adcionar contato");
            System.out.println("2: Consultar por posição");
            System.out.println("3: Consultar por nome do contato");
            System.out.println("4: Excluir contato");
            System.out.println("5: Mostrar total de contatos");
            System.out.println("6: Excluir todos os contatos");
            System.out.println("7: Mostra todos os contatos");
            System.out.println("0: Sair");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);    
                
                if (opcao >= 0 && opcao <= 7) {
                    entradaValida = true;
                if (opcao == 0) {
                    entradaValida = true;
                }
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {

                System.out.println("\nEntrada inválida, digite novamente\n");
            }
        }

        return opcao;
    }

    public static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        
        Contato contato;

        for (int i = 0; i < quantidade; i++) {
        
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("" + i +i + i + i + "-" + i + i + i + i);
            contato.setEmail("Contato" + i + "@email.com");

            lista.adcionar(contato);
        }
    }

} 
