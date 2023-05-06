public class Administrador extends Funcionario implements Autenticavel {

    @Override
    public double getBonificacao() {
        return 100;
    }

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public boolean autenticaSenha(int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }
    
}
