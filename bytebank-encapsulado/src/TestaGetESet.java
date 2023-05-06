public class TestaGetESet {
    
    public static void main(String[] args) {
        Conta conta = new Conta(0042, 5674);

        conta.setNumero(42);

        System.out.println(conta.getNumero());

        Cliente ana = new Cliente();
        ana.setNome("Ana"); 
        conta.setTitular(ana);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programadora");
        System.out.println(conta.getTitular().getProfissao());
    }
}
