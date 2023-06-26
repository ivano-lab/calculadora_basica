public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("soma")) {
            sum(x, y);
        } else if(args[0].equals("subtracao")) {
            minus(x, y);
        } else if(args[0].equals("multiplicacao")) {
            multiplication(x, y);
        } else if(args[0].equals("divisao")) {
            division(x, y);
        } else if(args[0].equals("modulo")) {
            module(x, y);
        } else {
            System.out.println("Nenhuma instrução definida!");
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    static void division(int x, int y) {
        System.out.println(x / y);
    }

    static void module(int x, int y) {
        System.out.println(x % y);
    }
}
