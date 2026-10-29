import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int k = 1; k <= n + 1; k++) {
                for (int s = 1; s <= n + 1 - k; s++) {
                    System.out.print("  ");
                }
                for (int star = 1; star <= k; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int k = n; k >= 1; k--) {
                for (int s = 1; s <= n + 1 - k; s++) {
                    System.out.print("  ");
                }
                for (int star = 1; star <= k; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}