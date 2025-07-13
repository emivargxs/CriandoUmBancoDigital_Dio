import java.util.HashSet;
import java.util.Set;

public class SistemaBanco {
    private Set<ContaPoupanca> listaPoupanca = new HashSet<>();
    private Set<ContaCorrente> listaCorrente = new HashSet<>();
    
    public void adicionarCliente(ContaPoupanca c){
        listaPoupanca.add(c);
    }

    public void listarContas(){
        System.out.println("---Contas Poupanças---");
        listaPoupanca.forEach(c ->
        System.out.println("Agencia: " + c.getnroAgencia() +
                            " | Conta: " + c.getNroConta() +
                            " | Saldo: " + c.getSaldo())
        );
    }

    public ContaPoupanca buscarConta(int numeroConta){
        return listaPoupanca.stream()
        .filter(c -> c.getNroConta() == numeroConta)
        .findFirst()
        .orElse(null);
    }

    public void adicionarClientePoupanca(ContaPoupanca c){
        listaPoupanca.add(c);
    }

    public void listarContasPoupanca(){
        System.out.println("--- Contas Poupança ---");
        listaPoupanca.forEach(c ->
            System.out.println("Agencia: " + c.getnroAgencia() +
                               " | Conta: " + c.getNroConta() +
                               " | Saldo: " + c.getSaldo())
        );
    }

    public ContaPoupanca buscarContaPoupanca(int numeroConta){
        return listaPoupanca.stream()
            .filter(c -> c.getNroConta() == numeroConta)
            .findFirst()
            .orElse(null);
    }

    public void adicionarClienteCorrente(ContaCorrente c){
        listaCorrente.add(c);
    }

    public void listarContasCorrente(){
        System.out.println("--- Contas Corrente ---");
        listaCorrente.forEach(c ->
            System.out.println("Agencia: " + c.getnroAgencia() +
                               " | Conta: " + c.getNroConta() +
                               " | Saldo: " + c.getSaldo())
        );
    }

    public ContaCorrente buscarContaCorrente(int numeroConta){
        return listaCorrente.stream()
            .filter(c -> c.getNroConta() == numeroConta)
            .findFirst()
            .orElse(null);
    }
}
