public class TesteContas {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(42, 125);
        ContaPoupanca cp = new ContaPoupanca(42, 150);

        cp.deposita(15000);
        cc.deposita(1000);

        cp.transfere(1000, cc);

        cc.saca(50);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
