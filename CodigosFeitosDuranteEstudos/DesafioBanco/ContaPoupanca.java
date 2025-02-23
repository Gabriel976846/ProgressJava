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

    // metodo contruido necessitando referencia o objeto para poder ser possivel a tranferencia de valores
    public void tranferencia(long valorasertranferido, ContaCorrente contaCorrente){
        if (valorasertranferido > 0){
            if (valorasertranferido <= contaCorrente.getSaldocontacorrente()){
                setSaldocontapoupanca(getSaldocontapoupanca() + valorasertranferido);
                contaCorrente.setSaldocontacorrente(contaCorrente.getSaldocontacorrente() - valorasertranferido);
            } else {
                System.out.println("O valor que deseja tranferir, é maior que o valor na conta poupança");
            }
        } else {
            System.out.println("Digite um valor acima do minimo");
        }
    }
}
