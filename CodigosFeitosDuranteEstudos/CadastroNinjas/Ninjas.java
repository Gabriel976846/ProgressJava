package CodigosFeitosDuranteEstudos.CadastroNinjas;

public class Ninjas {
    private String nome;
    private String vila;
    private int idade;

    public Ninjas(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "===== Ninja =====\n" +
                "Ninja: " + getNome() + "\n" +
                "Vila: " + getVila() + "\n" +
                "Idade: " + getIdade();
    }
}
