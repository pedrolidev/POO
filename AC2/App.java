import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarCalculando = true;

        while (continuarCalculando) {
            double num1 = lerNumero("Digite o valor do primeiro número: ", scanner);
            char operacao = escolherOperacao(scanner);
            double num2 = lerNumero("Digite o valor do segundo número: ", scanner);

            double resultado = calcularOperacao(num1, operacao, num2);
            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar utilizando a calculadora? (s para sim, caso queira sair pressione qualquer outra tecla): ");
            String escolha = scanner.next();
            continuarCalculando = escolha.equalsIgnoreCase("s");
        }

        System.out.println("Fim dos cálculos.");
        scanner.close();
    }

    private static double lerNumero(String mensagem, Scanner scanner) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    private static char escolherOperacao(Scanner scanner) {
        System.out.print("Escolha uma operação para o cálculo dos números (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    private static double calcularOperacao(double n1, char operacao, double n2) {
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operação indisponível.");
        }

        return resultado;
    }
}
