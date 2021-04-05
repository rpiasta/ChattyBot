import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean first = cups >= 10 && cups <= 20 && !weekend;
        boolean second = cups >= 15 && cups <= 25 && weekend;

        System.out.println(first || second);
    }
}