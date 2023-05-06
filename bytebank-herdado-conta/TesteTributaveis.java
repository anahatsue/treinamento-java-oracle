public class TesteTributaveis {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(42, 1245);
        cc.deposita(1000);

        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorImposto calculadorImposto = new CalculadorImposto();

        calculadorImposto.registra(cc);
        calculadorImposto.registra(seguro);

        System.out.println(calculadorImposto.getTotalImposto());


    }
}
