package demo.src.main.java.com.example;

public class Carta {
    private String nome;
    private String naipe;

    public Carta(String nome, String naipe){
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNome() { return nome;}
    public String getNaipe() { return naipe;}

    public void setNome(String nome) { this.nome = nome;}
    public void setNaipe(String naipe) { this.naipe = naipe;}
}
