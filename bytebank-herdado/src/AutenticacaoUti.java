public class AutenticacaoUti {
    
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }
}
