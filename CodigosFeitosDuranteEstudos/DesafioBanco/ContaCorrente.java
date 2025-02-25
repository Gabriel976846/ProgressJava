package CodigosFeitosDuranteEstudos.DesafioBanco;

public class ContaCorrente extends ContaBancaria{

    private long saldocontacorrente;

    // Construtor
    public ContaCorrente(long saldocontacorrente) {
        this.saldocontacorrente = saldocontacorrente;
    }

    // Get e setter do meu atributo
    public long getSaldocontacorrente() {
        return saldocontacorrente;
    }

    public void setSaldocontacorrente(long saldocontacorrente) {
        this.saldocontacorrente = saldocontacorrente;
    }

    @Override
    public void deposito(long valordeposito) {
        if (valordeposito > 0){
            taxadeservico(valordeposito);
            setSaldocontacorrente(getSaldoconta());
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
            System.out.println("Saldo: R$" + getSaldocontacorrente());
        } else {
            System.out.println("Sua Conta está Zerada");
        }
    }

    // metodo contruido necessitando referencia o objeto para poder ser possivel a tranferencia de valores
    public void tranferencia(long valorasertranferido, ContaPoupanca contaPoupanca) {
        if (valorasertranferido > 0) {
            if (valorasertranferido <= contaPoupanca.getSaldocontapoupanca()) {
                taxadeservico(valorasertranferido);
                setSaldocontacorrente(getSaldocontacorrente() + valorasertranferido);
                contaPoupanca.setSaldocontapoupanca(contaPoupanca.getSaldocontapoupanca() - valorasertranferido);
            } else {
                System.out.println("O valor que vc deseja tranferir é maior que o valor na conta");
            }
        } else {
            System.out.println("Digite um valor valido.");
        }
    }

}
