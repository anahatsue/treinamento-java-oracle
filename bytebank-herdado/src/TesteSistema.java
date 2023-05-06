public class TesteSistema {
    
    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        g.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Cliente cliente1 = new Cliente();
        cliente1.setSenha(1278);

        SistemaInterno scliente = new SistemaInterno();
        scliente.autentica(cliente1);
    }
}
