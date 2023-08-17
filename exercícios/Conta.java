package testes;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public double saca(Double valor) {
        saldo -= valor;
        return saldo;
    }

    public double deposita(Double valor) {
        saldo += valor;
        return saldo;
    }

    public double calcularRendimento() {
        double valor = saldo * 0.1;
        return valor;
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        
        conta.titular = "Titular";
        conta.numero = 12;
        conta.agencia = "0011";
        conta.saldo = 200;
        conta.dataAbertura = "17/08/2003";
        System.out.println(conta.deposita(200.0));
        System.out.println(conta.saca(20.0));
        System.out.println(conta.calcularRendimento());
    }
}
