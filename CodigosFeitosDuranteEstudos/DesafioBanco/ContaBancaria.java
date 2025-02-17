package CodigosFeitosDuranteEstudos.DesafioBanco;

public abstract class ContaBancaria implements Conta{
    private long saldoconta;

    // Get e setter do meu atributo
    public long getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(long saldoconta) {
        this.saldoconta = saldoconta;
    }

    @Override
    public abstract void deposito(long valordeposito);

    @Override
    public abstract void tranferencia(long valorasertranferido);

    @Override
    public abstract void consultarsaldo(long valornaconta);

    public void taxadeservico(long valortaxaquevaidescontar){
        double porcentotaxaemdecimal = 0.98;
        this.saldoconta = (long) (valortaxaquevaidescontar * porcentotaxaemdecimal);
    }
}
