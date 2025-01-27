package CodigosFeitosDuranteEstudos.Java10x.Intermediario.Desafio04;

public class main {
    public static void main(String[] args) {

        NinjaBase Naruto = new NinjaBase("Naruto", "Ragengan", 18);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

        NInjaAvancado Kakashi = new NInjaAvancado("Kakashi", "Chidori", 35);
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();

    }
}
