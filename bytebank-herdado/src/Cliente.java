public class Cliente implements Autenticavel {

    private AutenticacaoUti util;

    public Cliente() {
        this.util = new AutenticacaoUti();
    }

    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    public boolean autenticaSenha(int senha) {
        return this.util.autenticaSenha(senha);
    }    
}
