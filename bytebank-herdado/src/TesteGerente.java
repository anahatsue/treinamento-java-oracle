public class TesteGerente {
    
    public static void main(String[] args) {
        
        Gerente testeGerente = new Gerente();

        testeGerente.setNome("Marco");
        testeGerente.setSalario(2500);

        System.out.println(testeGerente.getNome());

        testeGerente.setSenha(1234);
        boolean autenticaSenha = testeGerente.autenticaSenha(1234);
        System.out.println(autenticaSenha);

        System.out.println(testeGerente.getBonificacao());
        System.out.println(testeGerente.getSalario());

    }
}
