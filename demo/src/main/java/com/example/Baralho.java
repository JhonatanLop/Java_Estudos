package demo.src.main.java.com.example;

import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private Carta[] cartas = new Carta[4];
    private int indice = cartas.length;

    
    public void incluirCarta(int indice, Carta carta){
        cartas[indice] = carta; 
    }

    public static Baralho embaralhar(Baralho baralho){

        return baralho;
    }

    public static Carta distribuirCarta(Baralho baralhoo){
        Carta[] cartas = baralhoo.getCartas();
        int qtd = 0;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                qtd += 1;
            }
        }
        baralhoo.setIndice(qtd);

        if (qtd > 0) {
            Carta novaCarta = cartas[qtd-1];
            cartas[qtd-1] = null;
            return novaCarta;
        }
        return null;
    }

    public void embaralharBaralho(Baralho baralho){
        for (int i = 0; i < 5; i++){
            int ale1 = (int) (Math.random() * baralho.getIndice());
            int ale2 = (int) (Math.random() * baralho.getIndice());
            Collections.swap(Arrays.asList(baralho.cartas), ale1, ale2);
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
