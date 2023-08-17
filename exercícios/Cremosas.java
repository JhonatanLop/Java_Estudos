package testes;
import java.util.Scanner;

public class Cremosas {
    Scanner leia = new Scanner(System.in);
    int n;
    int m;
    int k;
    

    public int calcularCremosas() {
        System.out.println("quantas menines vc viu no sábadão?");
        n = leia.nextInt();

        System.out.println("quantas menines vc viu no sábadão?");
        m = leia.nextInt();

        k = n + m;
        return k;
    }

    public static void main(String[] args) {
        Cremosas menines = new Cremosas();
        System.out.println(menines.calcularCremosas());
    }
}
