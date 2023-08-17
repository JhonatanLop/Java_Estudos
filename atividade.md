# Atividade

1. imprimindo número de de 150 a 300

    ```java
    package md.java;

    public class Imprimindo {
        public static void main(String[] args) {
            // imprimir números de 150 a 300
            int i = 150;
            while (i <= 300) {
                System.out.println(i);
                i ++;
            }
        }
    }
    ```

    |valor de i|print|incremento|
    |----------|-----|----------|
    |150|150|150 + 1|
    |151|151|151 + 1|
    |e assim por diante...|||
    |299|299|299 + 1|
    |300|300||

2. imprimindo número de 1 até 1000

    ```java
    public class Imprimindo {
        public static void main(String[] args) {
            int i = 1;
            while (i <= 1000) {
                System.out.println(i);
                i ++;
            }
        }
    }
    ```

    |valor de i|print|incremento|
    |----------|-----|----------|
    |1|1|1 + 1|
    |2|2|2 + 1|
    |e assim por diante...|||
    |999|999|999 + 1|
    |1000|1000||

3. imprimir todos os multiplos dee 3 entre 1 e 100

    ```java
    public class ImprimindoMult {
        public static void main(String[] args) {
            int indice = 1;
            while (indice < 101) {
                if (indice % 3 == 0) {
                    System.out.println(indice);
                }
            indice ++;
            }
        }
    }
    ```

    |valor de indice|verificação|print|incremento|
    |----------|----|-----|----------|
    |1|é divisível por 3 = false||1 + 1|
    |2|é divisível por 3 = false||2 + 1|
    |3|é divisível por 3 = true|3|3 + 1|
    |e assim por diante...|||

4. Imprimindo fatorial

    ```java
    public class ImprimindoFatorial {
        public static void main(String[] args) {
            int i = 1;
            while (i < 11) {
                // printando o primeiro fatorial
                if (i == 1) {
                    System.out.println(i);
                } 
                else {
                    // definindo o número atual
                    int numeroAtual = i;
                    int fatorial = 1;
                    while (numeroAtual > 1) {
                        // definindo o próximo número a ser multiplicado
                        int proximoNumero = numeroAtual - 1;
                        // o fatorial número atual * o próximo
                        fatorial = fatorial * (numeroAtual * proximoNumero);
                        // subtraindo o número atual por 2 para eliminar os que já foram multiplicados
                        numeroAtual = numeroAtual - 2;
                    }
                    System.out.println(fatorial);
                }
                i++;
            }
        }
    }
    ```

    |valor de indice|numero atual|próximo número|fatorial|numero atual|condição
    |----------|----|-----|----------|-------|----|
    |1|1||1 por conveção|||
    |2|2|2-1=1|1 * (2 * 1) = 2|2 - 2 = 0|numero atual > 1 continue -> false|
    |3|3|3-1=2|1 * (3 * 2) = 6|3 - 2 = 1|numero atual > 1 continue -> false|
    |4|4|4-1=3|1 * (4 * 3) = 12|4 - 2 = 2|numero atual > 1 continue -> true|
    |4|2|2-1=1|12 * (2 * 1) = 24|2 - 2 = 0|numero atual > 1 continue -> false|
    |e assim por diante...|||