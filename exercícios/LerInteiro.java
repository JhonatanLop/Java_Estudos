package testes;
import java.util.Scanner;

public class LerInteiro {
    Scanner leia = new Scanner(System.in);
    int n;
    int m;
    String resp;
    
    public String comparador() {
        System.out.println("digite o valor de n ");
        n = leia.nextInt();
        System.out.println("digite o valor de m ");
        m = leia.nextInt();

        while (n < m) {
            resp = "N";
            System.out.println(resp);
            n++;
        }
        resp = "S";
        return resp;
    }

    public static void main(String[] args) {
        LerInteiro resposta = new LerInteiro();
        System.out.println(resposta.comparador());
    }
}
