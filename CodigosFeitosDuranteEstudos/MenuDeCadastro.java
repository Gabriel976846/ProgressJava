package CodigosFeitosDuranteEstudos;
import java.util.Scanner;

/* Exercicio feito usando:
*array,
* scanner,
* laço de repetição
* Switch Case
*/

public class MenuDeCadastro {
    public static void main(String[] args) {
        Scanner EntradaDeDados = new Scanner(System.in);

        // Definição de valor maximo
        System.out.print("Quantidade de Usuarios: ");
        int valormaximo = EntradaDeDados.nextInt();

        // Array
        String[] pessoas = new String[valormaximo];

        // contador
        int quantidadepessoas = 0;
        int escolha = 0;

        while (escolha != 3) {
            // Menu de interação
            System.out.println("\n===== Menu Escolha =====");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Listar Cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = EntradaDeDados.nextInt();

            // resultado da opção escolhida
            switch (escolha) {
                // Cadastro de pessoa
                case 1:
                    if (quantidadepessoas < valormaximo) {
                        System.out.print("Nome: ");
                        String nome = EntradaDeDados.nextLine();
                        pessoas[quantidadepessoas] = nome;
                        quantidadepessoas++;
                    } else {
                        System.out.println("O Array esta cheio");
                    }
                    break;
                // Mostrando os cadstrados no array
                case 2:
                    if (quantidadepessoas == 0) {
                        System.out.println("O Array está vazio");
                    } else {
                        for (int i = 0; i < pessoas.length; i++) {
                            System.out.println(pessoas[i]);
                        }
                    }
                    break;
                // Saida do programa
                case 3:
                    System.out.println("Fim do programa");
                    break;
                // Opção caso nenhum dos três valores tenha sido escolhiido
                default:
                    System.out.println("Escolha um valor possivel");
                    break;
            }
        }
    }
}
