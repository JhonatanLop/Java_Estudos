package demo.src.main.java.com.example;

import java.util.Scanner;

public class Main {
    static Scanner leia = new Scanner(System.in);
    static Baralho baralho = new Baralho();
    
    
    public static void main(String[] args) {
        String loop = "";
        int resp;
        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o naipe:");
            String naipe = leia.next();
            System.out.println("Digite o Nome da carta:");
            String nome = leia.next();

            Carta nCarta = new Carta(nome,naipe);
            baralho.incluirCarta(i,nCarta);
        }
        while (loop != "não"){
            System.out.println("qual metodo desja usar?\n1- distribuir cartas\n2- embaralhar");
            resp = leia.nextInt();
            if (resp == 1) {
                Carta carta = Baralho.distribuirCarta(baralho);
                System.out.println("A carte é:"+carta.getNaipe()+carta.getNome());
            } else if(resp == 2) {
                Baralho.embaralhar(baralho);
            }
        }
    }
}
