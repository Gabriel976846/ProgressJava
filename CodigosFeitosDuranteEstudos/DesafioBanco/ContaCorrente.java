package CodigosFeitosDuranteEstudos.DesafioBanco;

public class ContaCorrente extends ContaBancaria{
    @Override
    public void deposito(double valor) {
        if (valor > 0){
            System.out.println("Valor depositado");
            taxa(valor);
            saldocorrente = this.saldo;
        } else {
            System.out.println("Não foi de positado nenhum valor");
        }
    }
    @Override
    public void consultarsaldo() {
        System.out.println("O saldo da sua conta " + TipoConta.CORRENTE);
        System.out.println("Valor: " + saldocorrente);
    }
}
