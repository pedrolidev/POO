public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Este é um comentário
         * de bloco. Posso escrever várias linhas.
         */
        System.out.println("Hello, World!"); // Comentário de uma linha

        // Tipos de dados
        // <tipoVar> <nomeVar1>, <nomeVar2>, <nomeVar3>, ...;
        double x, y, z;
        // <tipoVar> <nomeVar> = <valor>;
        String nome = "Pedro";

        // inteiros
        byte a = -50;       // 8 bits  -> -128 a 127
        short b = 15750;    // 16 bits -> -32.768 a 32.767
        int c = 1050000;    // 32 bits -> padrão
        long d = 15600000l; // 64 bits

        // decimais
        float e = 4.85f;    // 32 bits
        double f = -105.48; // 64 bits -> padrão

        // booleano -> 1 bit
        boolean teste = true;
        boolean outroTeste = false;

        // texto
        char letra = 'a'; // uso de aspas simples. Ocupa 2 bytes e usa UNICODE
        String outroNome = "Pedro"; // não é um tipo de dado primitivo!

        // type casting
        f = (double) b;
        System.out.println(e);
        c = (int) e;
        System.out.println(c);
        System.out.println(e);

        // Operadores
        // Aritméticos
        x = 10.5;
        y = -4.5;
        z = 2.2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        // Atribuição
        x += 2;   // x = x + 2
        z -= 1.5; // z = z - 1.5
        x++;
        x--;

        System.out.println("---------------");
        System.out.println(x);
        System.out.println(x++); // Uso a variável e depois incremento
        System.out.println(x);
        System.out.println(++x); // Incremento e depois uso a variável

        c = 2;
        int w = ++c;
        System.out.println(w);

        w = c--;
        System.out.println(w);
        System.out.println(c);

        // Comparação
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);

        // Lógicos
        System.out.println(!false);        // NOT
        System.out.println(true && false); // AND
        System.out.println(true || false); // OR

        System.out.println("---------------");

        // Estruturas de decisão
        // if-else
        int idade = 19;

        if (idade > 18) {
            System.out.println("Você é maior de idade");
        } else if (idade < 0) {
            System.out.println("Idade inválida");
        } else {
            System.out.println("Você é menor de idade");
        }

        // NÃO É BOA PRÁTICA!!!
        if (idade > 18)
            System.out.println("Você é maior de idade");
        else
            System.out.println("Você é menor de idade");

        // switch
        String opcao = "a";

        switch (opcao) {
            case "a":
                System.out.println("Opção a");
                break;
            case "b":
                System.out.println("Opção b");
                break;
            case "c":
                System.out.println("Opção c");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("---------------");
        // Estruturas de repetição
        // for
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        for (i = 0; i < 10; i++) {
            i++;
            if (i == 3) {
                continue; // Interrompe a iteração
            }
            System.out.println(i);
            if (i == 5) {
                break;    // Interrompe o for
            }
        }

        // while
        i = 10;
        while (i > 0) {
            System.out.println(i--);
        }
    }
}