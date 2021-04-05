import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String input1 = input.toUpperCase();
        boolean result = input1.startsWith("J");

        System.out.println(result);

    }
}