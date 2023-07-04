import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a operação? ");
        String operacao = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        if (operacao.equals("soma")) {
            sum(x, y);
        } else if (operacao.equals("subtração")) {
            minus(x, y);
        } else if (operacao.equals("multiplicação")) {
            multiplication(x, y);
        } else if (operacao.equals("divisão")) {
            division(x, y);
        } else if (operacao.equals("módulo")) {
            module(x, y);
        } else {
            System.out.println("Operação inválida!");
        }
    }

    static void sum(int x, int y) {
        System.out.println("O resultado da soma é " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("O resultado da subtração é " + (x - y));
    }

    static void multiplication(int x, int y) {
        System.out.println("O resultado da multiplicação é " + (x * y));
    }

    static void division(int x, int y) {
        System.out.println("O resultado da divisão é " + (x / y));
    }

    static void module(int x, int y) {
        System.out.println("O módulo da divisão é " + (x % y));
    }
}
