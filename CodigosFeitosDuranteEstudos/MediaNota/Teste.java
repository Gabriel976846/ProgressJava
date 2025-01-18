package CodigosFeitosDuranteEstudos.MediaNota;

public class Teste {
    double PrimeiraNota;
    double SegundaNota;

    public void Aprovado(){
        System.out.println("Você foi aprovado");
    }

    public void AvaliacaoFinal(){
        System.out.println("Você vai para as provas Finais");
    }

    public void Reprovado(){
        System.out.println("Você foi reprovado");
    }

    public double Media(double x, double y){
        return (x + y) / 2;
    }

    public double resultado(double Resultado){
        return 10 - Resultado;
    }
}
