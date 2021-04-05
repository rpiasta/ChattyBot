import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ready = 0;
        int fixed = 0;
        int reject = 0;

        for (int i = 0; i < n; i++) {
            int state = scanner.nextInt();
            if (state == 0) {
                ready++;
            } else if (state == -1) {
                reject++;
            } else {
                fixed++;
            }
        }
        System.out.println(ready + " " + fixed + " " + reject);
    }
}