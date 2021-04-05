import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result1 = number / 100;
        int result2 = number % 100 / 10 * 10;
        int result3 = number % 10 * 100;
        int result = result1 + result2 + result3;

        System.out.println(result);
    }
}