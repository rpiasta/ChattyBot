import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean check1 = a + b == 20;
        boolean check2 = b + c == 20;
        boolean check3 = c + a == 20;
        boolean check = check1 || check2 || check3;

        System.out.println(check);
    }
}