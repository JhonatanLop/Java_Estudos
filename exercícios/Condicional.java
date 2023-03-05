package exercícios;
public class Condicional {
    public static void main(String[] args) {
        // int idade = 19;
        // if (idade >= 18) {
        //     System.out.println("é maior de idade");
        // }
        // else{
        //     System.out.println("é menor de idade");
        // }
        int idade = 20;
        if (idade == 18) {
            System.out.println("é maior de idade e tem 18 anos");
        }
        else if (idade > 19) {
            System.out.println("é maior de idade e tem mais de 18 anos");
        }
        else{
            System.out.println("é menor de idade");
        }
    }
}
