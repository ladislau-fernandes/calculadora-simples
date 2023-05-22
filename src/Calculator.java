import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digíte o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digíte o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.print("Digite a operação (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação invalida.");
                return;
        }
        System.out.println("O resultado é: " + result);

    }
}