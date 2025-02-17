package CodigosFeitosDuranteEstudos.DesafioBanco;

public class ContaPoupanca extends ContaBancaria{
    private long saldocontapoupanca;

    // Construtor
    public ContaPoupanca(long saldocontapoupanca) {
        this.saldocontapoupanca = saldocontapoupanca;
    }

    // Get e setter do meu atributo
    public long getSaldocontapoupanca() {
        return saldocontapoupanca;
    }

    public void setSaldocontapoupanca(long saldocontapoupanca) {
        this.saldocontapoupanca = saldocontapoupanca;
    }

    @Override
    public void deposito(long valordeposito) {
        if (valordeposito > 0){
            taxadeservico(valordeposito);
            this.setSaldocontapoupanca(getSaldoconta());;
            System.out.println("Deposito Feito com Sucesso");
        } else {
            System.out.println("O deposito não tem valor");
        }
    }

    @Override
    public void consultarsaldo(long valornaconta) {
        if (valornaconta > 0){
            taxadeservico(valornaconta);
            System.out.println("Seu saldo Atual.");
            System.out.println("Saldo: R$" + getSaldocontapoupanca());
        } else {
            System.out.println("Sua Conta está Zerada");
        }
    }

    @Override
    public void tranferencia(long valorasertranferido) {

    }
}
