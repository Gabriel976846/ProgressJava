package CodigosFeitosDuranteEstudos;

import java.util.Locale; // Biblioteca para o meu programa usar o ponto flutuante
import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner caixaDeEntrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = caixaDeEntrada.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = caixaDeEntrada.nextDouble();

        if (nota1 >= 0 && nota1 <=10){
            if (nota2 >= 0 && nota2 <=10) {
                // Calculo de média
                double media = (nota1 + nota2) / 2;

                // Confirmação se foi aprovado ou não
                if (media >= 7) {
                    System.out.println("Aluno Aprovado");
                    System.out.println("Nota: " + media);
                }  else if (media < 7 && media >= 4) {
                    System.out.println("Aluno Ficou para as provas finais");
                    System.out.println("Nota: " + media);
                } else {
                    System.out.println("Aluno foi reprovado");
                    System.out.println("Nota: " + media);
                }
            }
        } else {
            System.out.println("Notas fora do limite");
        }
    }

}

