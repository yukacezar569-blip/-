import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int number = i;
            while (number > 0) {
                if (number % 10 == x) {
                    total++;
                }
                number /= 10;
            }
        }
        System.out.println(total);
    }
}
