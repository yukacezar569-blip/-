import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 1; i <= 2 * n - 1; i++) {
                int k;
                if (i <= n) {
                    k = i;
                } else {
                    k = 2 * n - i;
                }
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j >= n - k + 1 && j <= n + k - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

