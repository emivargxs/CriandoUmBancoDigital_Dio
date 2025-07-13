public class ContaCorrente extends Conta implements Operacoes {

    public ContaCorrente() {
    super();
    }
    
    @Override
    public void sacar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

    @Override
    public void depositar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Valor invalido para deposito.");
        }
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("-----EXTRATO CONTA BANCARIA-----");
        System.out.println("Conta Corrente");
        System.out.println("Agencia: " + getnroAgencia());
        System.out.println("Conta: " + getNroConta());
        System.out.println("Saldo: " + getSaldo());
    }

    @Override
    public double saldo(){
        return getSaldo();
    }
}