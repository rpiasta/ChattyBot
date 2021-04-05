import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value % 4 == 0 && value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}