import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean check1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean check2 = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean check3 = num1 <= 0 && num2 <= 0 && num3 > 0;

        System.out.println(check1 || check2 || check3);
    }
}