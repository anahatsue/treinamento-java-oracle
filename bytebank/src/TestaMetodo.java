public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaAna = new Conta();
        contaAna.deposita(15000);

        Conta contaPedro = new Conta();
        contaPedro.deposita(15000);

        contaAna.transfere(5000, contaPedro);
        System.out.println(contaPedro.saldo);
        System.out.println(contaAna.saldo);

        contaAna.titular = "Ana Hatsue";
    }
}
