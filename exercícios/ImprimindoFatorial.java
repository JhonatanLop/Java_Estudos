package exercícios;

public class ImprimindoFatorial {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            if (i == 1) {
                System.out.println(i);
            } 
            else {
                int numeroAtual = i;
                int fatorial = 1;
                while (numeroAtual > 1) {
                    int proximoNumero = numeroAtual - 1;
                    fatorial = fatorial * (numeroAtual * proximoNumero);
                    numeroAtual = numeroAtual - 2;
                }
                System.out.println(fatorial);
            }
            i++;
        }
    }
}
