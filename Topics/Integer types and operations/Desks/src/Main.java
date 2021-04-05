import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        int rest1 = firstGroup % 2;
        int rest2 = secondGroup % 2;
        int rest3 = thirdGroup % 2;
        int desks = firstGroup / 2 + rest1 + secondGroup / 2 + rest2 + thirdGroup / 2 + rest3;

        System.out.println(desks);
    }
}