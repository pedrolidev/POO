import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        String msg;
        double num1;
        int num2;

        System.out.println("Informe um texto: ");
        msg = leitor.next(); // lê input de texto
        System.out.println(msg);

        System.out.println("Informe um double: ");
        num1 = leitor.nextDouble(); // lê input de double
        System.out.println(num1);

        System.out.println("Informe um int: ");
        num2 = leitor.nextInt(); // lê input de inteiros
        System.out.println(num1 + "" + num2);

        leitor.close();
    }
}
