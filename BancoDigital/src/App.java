public class App {
    public static void main(String[] args) throws Exception {
        SistemaBanco sistema = new SistemaBanco();

        ContaPoupanca c1 = new ContaPoupanca();
        ContaPoupanca c2 = new ContaPoupanca();
        ContaPoupanca c3 = new ContaPoupanca();

        sistema.adicionarCliente(c1);
        sistema.adicionarCliente(c2);
        sistema.adicionarCliente(c3);

        c1.depositar(100);
        c2.depositar(200);
        c3.depositar(300);
        
        c1.imprimirExtrato();
        c2.imprimirExtrato();

        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();

        sistema.adicionarClienteCorrente(cc1);
        sistema.adicionarClienteCorrente(cc2);

        cc1.depositar(500);
        cc2.depositar(1000);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}
