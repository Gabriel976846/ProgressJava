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

    @Override
    public void tranferencia(long valorasertranferido) {
        if (valorasertranferido > 0){
            taxadeservico(valorasertranferido);
            setSaldocontacorrente(valorasertranferido + getSaldocontacorrente());
        }
    }

}
