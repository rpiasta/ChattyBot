import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int rest = n % 2;
        int result = n + (4 - rest * 2) / 2;

        System.out.println(result);
    }
}