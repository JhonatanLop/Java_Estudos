# Entendendo Java

Uma das coisas mais importantes a serem usanas na hora do desenvolvimento de aplicações Java, é a padronização do código<br>
Java é case sensitive, isso é, sensível a letras maiúsculas e minúsculas<br>
Java, utiliza o CamelCase, que é uma forma de escrever utilizando sempre as primeiras palavras em maiúsculas<br>

Sempre que a primeira letra estiver em maiúscula, ela indica uma classe.<br>
Uma classe contém atributos e métodos<br>

Sempre que a primeira letra estiver em minúscula, ela pode representar um atributo, uma variável ou um método<br>

- MinhaClasse
> Representa uma classe

- meuAtributo
> representa um atributo

- minhaVariavel
> representa uma variável

- meuMetodo
> representa um método

- meu_pacote
> representa um pacote

Um pacote ou **package** é representado apenas por letras minúsculas

- MINHA_CONSTANTE
> representa uma constante

Uma constante é representada por apenas letras maiúsculas

```Java

// nome começa com maiúsculo pois é uma classe
public class HelloWorld {
    // main começa com minúsculo pois é um método
    // void indica um método
    public static void main(String[] args) {
        // System é uma classe para identifica o sistema a ser executado o código
        // No meu caso é um sistema windows
        // ----
        // out é um método de saída, para exibir alguma coisa
        // println também é um método. Imprimi algo na saída
        System.out.println(); //sout
    }
}
```

## Importando pacotes

Para importar pacotes dentro do java, existe um comando chamado ```import```

```java
import meu pacote;
public class MinhaClasse {
    public static void main(String[] args) {
        // meu código
    }
}
```

## Tipos de variáveis

tipos comuns:
1. String
    > recebe um texto

    ```java
    String nome = "jhonatan";
    ```

2. int
    > recebe número inteiro

    ```java
    int idade = 19;
    ```

3. float
    > recebe número real com precisão de 7 caracteres após o ponto, usa ponto "." como separador

    ```java
    float altura = 1.75f;
    ```

    note que para declarar uma variável float é necessário colocar um "f" no final do valor. isso serve para<br>
    indicar o compilador que esta usando um valor float e não um double<br>

4. double
    > recebe número real com maior precisão de caracteres que float, utiliza vitgula "," como separador

    ```java
    double peso = 63,5;
    ```

5. boolean
    > recebe valor lógico, verdadeiro ou falso

    ```java
    boolean calvo = false;
    ```

## Imprimindo resultados

dado o seguinte script java...

```java
public class ExibindoVariaveis {

    public static void main(String[] args) {
        // meu código
        String nome = "Jhonatan";
        float tamanho = 1.75f;
        double peso = 63.5;
        int idade = 19;
        boolean calvo = false;
    }
}
```

existem duas formas e exibir variáveis em um print<br>

comum:

```java
System.out.println(nome + " tem " + idade + " anos, pesa " + peso + "kg e mede " + tamanho + "m... calvice =" + calvo);
// resultado: 
// Jhonatan tem 19 anos, pesa 63.5kg e mede 1.75m... calvice =false
```

e com formatação:

```java
System.out.println(String.format("Nome: %s | Idade: %d | Altura: %.2f | Peso: %.1f | Calvice: %b",
nome, idade, tamanho, peso, calvo));
// resultado:
// Nome: Jhonatan | Idade: 19 | Altura: 1,75 | Peso: 63,5 | Calvice:
```

## Operadores

Operadores aritméticos:

|símbolo|tipo|
|-------|----|
|+|soma|
|-|subtração|
|*|multiplicação|
|/|divisão|
|%|resto da divisão|
|**|potenciação|

Operadores lógicos:
|símbolo|tipo|
|-------|----|
|==|igualdade|
|>|maior que|
|<|menor que|
|>=|maior ou igual|
|<=|menor ou igual|
|!=|diferente de|
|&&|and|
|dois pipes|not|
|!|not|

## Condições

Estruturas de condições em java são simples como em outras linguagens<br>

```java
if(condição){
    bloco de código
}
else{
    bloclo de código
}
```

Um exemplo de condição onde é passado hard-coded um valor para idade e a condição verifica se é de maior ou <br>

```java
        int idade = 19;
        if (idade >= 18) {
            System.out.println("é maior de idade");
        }
        else{
            System.out.println("é menor de idade");
        }
```

Resultado: é maior de idade<br>

Também existe a possíbilidade de usar mais de um if, usando o ```else if```<br>

```java
public class Condicional {
    public static void main(String[] args) {
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
```

Resultado: é maior de idade e tem mais de 18 anos<br>

## Arrays

Array, comumente conhecida também como "lista", é de fato uma lista de informações<br>
Um tipo de variável capaz de guardar mais de uma informação<br>
<br>
Como se declara uma lista?<br>
Um array pode ser feito da seguinte forma

```java
public class Arrays {
    public static void main(String[] args) {

        String[] produto = {"Pacote Office", "Word", "Excel"};
        System.out.println(produto[0]);
    }
}
```

Repare que para criar o Array, eu utilizo a classe String, porém com colchetes "[]" no final, só isso já mostra para<br>
o interpretador que estamos utilizando array.<br>
O Array contem a primeira letra em minúsucula e deus itens devem ser delcarados dentro de chaves "{}" separados por vírgula<br>
<br>
Para "printar" a lista é necessário fazer um laço, pois só é possível printar um intem da lista por vez e mostrando o índice<br>

## Tipos primitivos e Manipulação de dados

