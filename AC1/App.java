public class App {

    public static void main(String[] args) throws Exception{
        media(8,5,6);
        numero('n');
        ePrimo(7);
        dias(3);
        eBissexto(2000);
    }

    public static void media(double a, double b, double c) {

        System.out.println((a + b) * 0.4 + (c * 0.2));

    }

    public static void numero(int n) {
        n = 150;

        while (n < 201) {
            System.out.print(n++);
            System.out.print(" ");
        }

    }

    public static void ePrimo(int num) {
        System.out.println();
        boolean ePrimo = true;
        String divisores = "";

        if (num <= 1) {
            ePrimo = false;
        } else {
            for (int i = 2; i <= (num); i++) {
                if (num % i == 0) {
                    ePrimo = false;
                    divisores += i + " ";
                }
            }
        }

        if (ePrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo. Ele é divisível por: " + divisores);
        }
    }

    public static void dias(int num) {

        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }

    public static void eBissexto(int ano) {
        if (ano % 4 == 0) {
            if(ano % 100 == 0 && ano % 400 != 0) {
                System.out.println(ano + " não é bissexto");
            } else {
                System.out.println(ano + " é bissexto.");
            }
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}