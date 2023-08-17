package baralho;

public class Baralho {
    Carta[] cartas = new Carta[52];

    public void incluirCarta(int indice, Carta carta){
        cartas[indice] = carta; 
    }
}
