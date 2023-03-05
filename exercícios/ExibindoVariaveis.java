package exercícios;
public class ExibindoVariaveis {

    public static void main(String[] args) {
        // meu código
        String nome = "Jhonatan";
        float tamanho = 1.75f;
        double peso = 63.5;
        int idade = 19;
        boolean calvo = false;
        // uma forma de imprimir as variáveis
        System.out.println(
                nome + " tem " + idade + " anos, pesa " + peso + "kg e mede " + tamanho + "m... calvice =" + calvo);
        // uma forma mais organizada
        System.out.println(String.format("Nome: %s | Idade: %d | Altura: %.2f | Peso: %.1f | Calvice: %b", nome, idade,
                tamanho, peso, calvo));
        // resultado: Nome: Jhonatan | Idade: 19 | Altura: 1,75 | Peso: 63,5 | Calvice:
        // false

    }
}