import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();
        int firstSecond = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();
        int secondSecond = scanner.nextInt();

        int result = secondHour * 3600 + secondMinute * 60 + secondSecond -
                (firstHour * 3600 + firstMinute * 60 + firstSecond);

        System.out.println(result);

    }
}