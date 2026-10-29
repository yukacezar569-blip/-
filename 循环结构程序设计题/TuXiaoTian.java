import java.util.Scanner;

public class TuXiaoTian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int k;
                if (i <= (n+1)/2) {
                    k = i;
                } else {
                    k = n - i + 1;
                }
                for (int j = 1; j <= (n+1)/2 - k; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*k - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

