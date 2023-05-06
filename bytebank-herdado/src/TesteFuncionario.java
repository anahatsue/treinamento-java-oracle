public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario testeFuncionario = new Gerente();

        testeFuncionario.setNome("Alessandra");
        testeFuncionario.setCpf("123456789-00");
        testeFuncionario.setSalario(2000.00);

        System.out.println(testeFuncionario.getNome());
        System.out.println(testeFuncionario.getBonificacao());


    }
}
