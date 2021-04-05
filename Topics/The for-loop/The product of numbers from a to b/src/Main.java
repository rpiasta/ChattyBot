import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a;
        long result = 1;

        for (; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}