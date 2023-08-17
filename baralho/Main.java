package baralho;

import java.util.Scanner;

public class Main {
    static Scanner leia = new Scanner(System.in);
    static Baralho baralho = new Baralho();
    
    
    public static void main(String[] args) {
        System.out.println("criar cartas? sim/sim");
        String resp = leia.next();
        for (int i = 0; i < 52; i++) {
            System.out.println("Digite o naipe:");
            String naipe = leia.next();
            System.out.println("Digite o Nome da carte:");
            String nome = leia.next();

            Carta nCarta = new Carta(nome,naipe);
            baralho.incluirCarta(i,nCarta);
        }

        System.out.println("criar cartas? sim/sim");
        resp = leia.next();

    }
}
