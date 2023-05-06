public class TesteReferencias {
    
    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente(); //Funcionário é a referência e é o mais genérico.
        //g1.autenticaSenha(); Esse código não roda, porque o objeto não é tipo Gerente, sim tipo Funcionário.

        g1.setNome("Maurício");
        System.out.println(g1.getNome());

        Gerente g2 = new Gerente();

        g2.setNome("Paula");
        g2.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g2);

        System.out.println(controle.getSoma());

        Funcionario cx1 = new Caixa();
        cx1.setNome("Marcelo");
        cx1.setSalario(1000);

        System.out.println(cx1.getBonificacao());



    }
}
