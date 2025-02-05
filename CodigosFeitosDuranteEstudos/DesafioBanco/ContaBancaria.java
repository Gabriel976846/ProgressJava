package CodigosFeitosDuranteEstudos.DesafioBanco;

public class ContaBancaria implements Conta{
    double saldo;
    double saldocorrente;
    double saldopoupanca;
    double valor;

    @Override
    public abstract void deposito(double valor);

    @Override
    public abstract void consultarsaldo();

    public void taxa(double calculovalor){
        double valortaxa = 0.95; // Taxa de 5%
        this.saldo = calculovalor * valortaxa;
        System.out.println("Taxa de 5% pelo serviço aplicada");
    }
}
