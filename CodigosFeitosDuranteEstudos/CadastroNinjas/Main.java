package CodigosFeitosDuranteEstudos.CadastroNinjas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Object> ListaNinjas = new ListaGenerica<>();
        Scanner entreadadedados = new Scanner(System.in);

        /*
        ListaNinjas.inserirninjas(new NinjasInfor("Sasuke", "Konoha", 17));
        ListaNinjas.inserirninjas(new NinjasInfor("Sakura", "Konoha", 23));
        ListaNinjas.inserirninjas(new NinjasInfor("Tobirama", "Konoha", 35));
        ListaNinjas.inserirninjas(new NinjasInfor("Rock lee", "Konoha", 14));
        ListaNinjas.inserirninjas(new NinjasInfor("Tsunade", "Konoha", 60));
         */

        while (true) {
            System.out.println("====== MENU NINJAS ======");
            System.out.println("Escolha a opção que deseja.");
            System.out.println("1 - Adicionar Ninja no Inicio");
            System.out.println("2 - Remover Ninja do Inicio");
            System.out.println("3 - Listar Ninjas");
            System.out.println("4 - Procurar Ninja pelo indice");
            System.out.println("5 -  Sair do programa");
            System.out.print("Digite Sua Opção: ");
            int escolha = entreadadedados.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("====== Cadastro Ninja ======");
                    entreadadedados.nextLine();
                    System.out.print("Nome do ninja: ");
                    String nomeninja = entreadadedados.nextLine();

                    System.out.print("Vila do ninja: ");
                    String nomedavila = entreadadedados.nextLine();

                    System.out.print("Idade do Ninja: ");
                    int idadedoninja = entreadadedados.nextInt();

                    ListaNinjas.inserirninjas(new Ninjas(nomeninja, nomedavila, idadedoninja));
                    break;
                case 2:
                    System.out.println("Ninja do Inicio removido");
                    ListaNinjas.excluirninja();
                    break;
                case 3:
                    System.out.println("=====Lista de Ninjas=====");
                    ListaNinjas.MostrarNinjas();
                    break;
                case 4:
                    System.out.println("=== Besquisa Ninja ===");
                    System.out.print("Digite o indice que deseja saber o Ninja:");
                    int indexninja = entreadadedados.nextInt();
                    ListaNinjas.acharninjaindex(indexninja);
                    break;
                case 5:
                    System.out.println("Saindo Do programa");
                    break;
                default:
                    System.out.println("Valor não aceito. Tente Novamente");
            }
            if (escolha==5){
                System.out.println("Volte Sempre");
                break;
            }
        }
        entreadadedados.close();
    }
}
