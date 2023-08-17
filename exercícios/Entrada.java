package exercícios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    Scanner leia = new Scanner(System.in);
    List<Integer> listaa = new ArrayList<Integer>();

    int a;
    int b;
    ArrayList<Integer> listas;

    public List<Integer> lista() {
        System.out.println("digite o valor de A");
        a = leia.nextInt();
        listas.add(a);

        System.out.println("digite o valor de B");
        b = leia.nextInt();
        listas.add(b);
        return listaa;
    }

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        System.out.println(entrada.lista());
    }
}
