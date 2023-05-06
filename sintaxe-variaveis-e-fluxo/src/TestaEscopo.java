public class TestaEscopo {
    
    public static void main(String[] args) {
        
        double salario = 3300.00;
        double impostoAPagar;

        if(salario <= 2800.00) {
            impostoAPagar = salario * 0.075;
            System.out.println("O imposto a pagar é de: R$ " + impostoAPagar + ".");
            System.out.println("Você poderá deduzir até R$ 142.00 na sua declaração.");
        } else if(salario > 2800.00 && salario <= 3751.00) {
            impostoAPagar = salario * 0.15;
            System.out.println("O imposto a pagar é de: R$ " + impostoAPagar + ".");
            System.out.println("Você poderá deduzir até R$ 350.00 na sua declaração.");
        } else if(salario > 3751.00 && salario <= 4664.00) {
            impostoAPagar = salario * 0.225;
            System.out.println("O imposto a pagar é de: R$ " + impostoAPagar + ".");
            System.out.println("Você poderá deduzir até R$ 363.00 na sua declaração.");
        } else {
            System.out.println("O seu salário é muito alto. Considere contratar um contador para garantir o pagamento de melhores alíquotas.");
        }

    }
}
