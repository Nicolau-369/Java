package out.production.Java.POO;

public class ContaTeste {

    public static void main(String[] args) {

    Conta conta = new Conta();
    conta.cliente = "Nicolau";
    conta.saldo = 4_000.00;
    conta.exibesaldo();

    conta.saque(2000);
    conta.exibesaldo();

    conta.deposita(8000);
    conta.exibesaldo();

    //conta.saque(2000);
    //conta.exibesaldo();
    
    //conta.deposita(8000);
    //conta.exibesaldo();
}
}
