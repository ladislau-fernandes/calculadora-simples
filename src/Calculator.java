import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operador;

        System.out.print("Digíte o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digíte o segundo número: ");
        num2 = scanner.nextDouble();


        System.out.print("Digite a operação (+, -, *, /): ");
        operador = scanner.next();

        char operadorChar = operador.charAt(0);

        Operacao operacao = new Operacao(num1, num2, operadorChar);
        double resultado = operacao.calcular();

        System.out.println("O resultado é: " + resultado);

    }
}