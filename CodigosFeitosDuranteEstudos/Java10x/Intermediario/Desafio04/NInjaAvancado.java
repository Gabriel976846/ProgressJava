package CodigosFeitosDuranteEstudos.Java10x.Intermediario.Desafio04;

public class NInjaAvancado extends NinjaBase implements Ninja{
    public NInjaAvancado(String nome, String Habilidade, int idade){
        super(nome, Habilidade, idade);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Meu nome: " + nome);
        System.out.println("Minha idade: " + idade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Minha Habilidade: " + Habilidade);
    }
}

