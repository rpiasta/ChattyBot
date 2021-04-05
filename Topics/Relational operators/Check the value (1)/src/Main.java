import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check1 = number < 10;
        boolean check2 = number > 0;

        System.out.println(check1 && check2);
    }
}