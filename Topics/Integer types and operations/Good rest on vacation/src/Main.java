import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int night = scanner.nextInt();

        int cost = duration * food + (duration - 1) * night + flight * 2;

        System.out.println(cost);
    }
}