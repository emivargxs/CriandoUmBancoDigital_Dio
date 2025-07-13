public abstract class Conta {
    private static final int NRO_AGENCIA = 453;
    private final int agencia;
    private static int nroConta = 1;
    private final int conta;
    private double saldo;
    
    public Conta(){
        this.agencia = NRO_AGENCIA;
        this.conta = nroConta++;
        this.saldo = 0.0;
    }

    public int getnroAgencia(){
        return agencia;
    }

    public int getNroConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Conta other = (Conta) obj;
    return this.conta == other.conta;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(conta);
    }

}
