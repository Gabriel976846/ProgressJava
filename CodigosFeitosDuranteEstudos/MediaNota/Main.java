package CodigosFeitosDuranteEstudos.MediaNota;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner EntradaInformacoes = new Scanner(System.in);

        // Objetos Utilizados
        Teste nota1 = new Teste();

        System.out.print("Nota 1: ");
        nota1.PrimeiraNota = EntradaInformacoes.nextInt();
        System.out.println(nota1);
    }
}
