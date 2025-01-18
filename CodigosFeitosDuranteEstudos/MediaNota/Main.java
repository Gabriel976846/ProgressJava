package CodigosFeitosDuranteEstudos.MediaNota;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner EntradaInformacoes = new Scanner(System.in);

        // Objetos Utilizados
        Teste Final = new Teste();
        Teste valor1 = new Teste();
        Teste valor2 = new Teste();

        // Adiquirindo nota 1
        System.out.print("Nota 1: ");
        valor1.PrimeiraNota = EntradaInformacoes.nextDouble();
        double Nota1 = valor1.PrimeiraNota;

        // Adiquirindo nota 2
        System.out.print("Nota 2: ");
        valor2.SegundaNota = EntradaInformacoes.nextDouble();
        double Nota2 = valor2.SegundaNota;

        if (Nota1 >= 0 && Nota1 <= 10) {
            if (Nota2 >= 0 && Nota2 <= 10){

                double Mediafinal = Final.Media(Nota1, Nota2);
                double MediaFInal = Final.resultado(Mediafinal);

                if (Mediafinal >= 7) {
                    Final.Aprovado();
                } else if (Mediafinal < 7 && Mediafinal >= 4) {
                    Final.AvaliacaoFinal();
                    System.out.println("Precisa de: " + MediaFInal);
                } else {
                    Final.Reprovado();
                }
            }
        }
        EntradaInformacoes.close();
    }
}
