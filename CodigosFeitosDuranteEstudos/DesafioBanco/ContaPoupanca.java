package CodigosFeitosDuranteEstudos.DesafioBanco;

public class ContaPoupanca extends ContaBancaria{
    @Override
    public void taxa(double calculovalor) {
        double valortaxa = 0.97; // Taxa de 3%
        this.saldo = calculovalor * valortaxa;
        System.out.println("Taxa de 3% pelo serviço aplicada");
    }

    @Override
    public void deposito(double valordeposito) {
        if (valordeposito > 0){
            System.out.println("Valor depositado");
            taxa(valordeposito);
            saldopoupanca = this.saldo;
        } else {
            System.out.println("Não foi de positado nenhum valor");
        }
    }

    @Override
    public void consultarsaldo() {
        System.out.println("Saldo Da Sua conta " + TipoConta.POUPANCA);
        System.out.println("VALOR: " + saldopoupanca);
    }
}
