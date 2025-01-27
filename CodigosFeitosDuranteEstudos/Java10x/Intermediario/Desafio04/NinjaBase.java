package CodigosFeitosDuranteEstudos.Java10x.Intermediario.Desafio04;

public class NinjaBase implements Ninja{
    String nome;
    String Habilidade;
    int idade;

    public NinjaBase(String nome, String Habilidade, int idade){
        this.nome = nome;
        this.Habilidade = Habilidade;
        this.idade = idade;
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
