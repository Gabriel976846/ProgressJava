package CodigosFeitosDuranteEstudos.DesafioBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objetos Utilizados
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        // entrada de valores
        Scanner entradaDeDados = new Scanner(System.in);

        while (true){
            // Menu interativo
            System.out.println("==== Banco Javeiro ====");
            System.out.println("1 - Deposito");
            System.out.println("2 - Vizualizar Saldo");
            System.out.println("3 - Sair do Banco");
            System.out.print("Escolha: ");
            int escolha = entradaDeDados.nextInt();

            // Realição do opção escolhida
            switch (escolha){
                case 1:
                    System.out.println("Escolha o tipo de conta que deseja depositar.");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    System.out.print("Opção: ");
                    int opcao = entradaDeDados.nextInt();

                    // Deposito de valores na conta escolhida
                    if (opcao == 1){
                        System.out.println("Será cobrado uma taxa pelo serviço.");
                        System.out.print("Valor: ");
                        double  entradadepositocorrente = entradaDeDados.nextDouble();
                        contaCorrente.deposito(entradadepositocorrente);
                    } else if (opcao == 2) {
                        System.out.println("Cobrado taxa pelo serviço.");
                        System.out.print("Valor: ");
                        double entradadepositopoupanca = entradaDeDados.nextDouble();
                        contaPoupanca.deposito(entradadepositopoupanca);
                    } else {
                        System.out.println("Opção não encontrada. Tente Novamente");
                    }
                    break;

                // Consulta de saldo na conta escolhida
                case 2:
                    System.out.println("Escolha sua conta que deseja vizualizar o Saldo");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    int desisao = entradaDeDados.nextInt();

                    if (desisao == 1){
                        contaCorrente.consultarsaldo();
                    } else if (desisao == 2) {
                        contaPoupanca.consultarsaldo();
                    } else {
                        System.out.println("Opção não encontrada. Tente Novamente");
                    }
                    break;

                // Saida do banco
                case 3:
                    System.out.println("Saindo do Banco");
                    break;

                default:
                    System.out.println("Opção não achada. Tente Novamente");
            }
            if (escolha == 3){
                System.out.println("Volte sempre.");
                break;
            }

            entradaDeDados.close();
        }

    }
}
