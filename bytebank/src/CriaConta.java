public class CriaConta {
     public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
                
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println(segundaConta.saldo);

        if(primeiraConta == segundaConta) {
         System.out.println("São as mesmas contas.");
     } else {
         System.out.println("São contas diferentes.");
     }
     }
}
