import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Um Numero: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite um  Operador +, -, *, / : ");
        char op = teclado.next().charAt(0);

        System.out.println("Digite Outro Numero: ");
        double n2 = teclado.nextDouble();

        switch (op) {
            case '+':
                resultado = n1 + n2;
                System.out.println("O Resultado da soma é: " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("O Resultado da Subtração é: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("O Resultado da Multiplicação é: " + resultado);
                break;

            case '/':
                resultado = n1 / n2;
                System.out.println("O Resultado da Divisão é: " + resultado);
                break;
            default:
                System.out.println("Operador Não Existe!!");
                break;
        }

    }
}
