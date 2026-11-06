import java.util.Scanner;

public class CompareMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] moon = new int[n];
        for (int i = 0; i < n; i++) {
            moon[i] = sc.nextInt();
        }
        if (moon[n - 1] == 0) {
            System.out.println("UP");
        } else if (moon[n - 1] == 15) {
            System.out.println("DOWN");
        } else if (n == 1) {
            System.out.println(-1);
        } else if (moon[n - 1] > moon[n - 2]) {
            System.out.println("UP");
        } else {
            System.out.println("DOWN");
        }
    }
}
