import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int n = scanner.nextInt();
        int i = 1;

        for (; i <= n; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                d++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 4) {
                b++;
            } else {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}