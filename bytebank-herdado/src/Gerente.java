public class Gerente extends Funcionario implements Autenticavel {

    public double getBonificacao(){
        return super.getSalario();
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
