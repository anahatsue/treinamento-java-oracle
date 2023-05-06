public class TestaBanco {
    
    public static void main(String[] args) {
        
        Cliente ana = new Cliente();
        ana.nome = "Ana Hatsue";
        ana.cpf = "123.456.789-00";
        ana.profissao = "programador";
        
        Conta contaAna = new Conta();
        contaAna.deposita(1000);

        contaAna.titular = ana;

        System.out.println(contaAna.titular.nome);

        Conta contaPedro = new Conta();
        contaPedro.titular = new Cliente();

        contaPedro.deposita(1000);
        contaPedro.titular.nome = "Pedro";
        

    }
}
