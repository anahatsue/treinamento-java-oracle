public class Caixa extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }

}
