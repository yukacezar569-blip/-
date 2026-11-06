import java.util.Arrays;
import java.util.Scanner;

public class NiuniuTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] side = new int[n];
        for (int i = 0; i < n; i++) {
            side[i] = sc.nextInt();
        }
        Arrays.sort(side);
        for (int i = 0; i < n - 2; i++) {
            if ((long) side[i] + side[i + 1] > side[i + 2]) {
                System.out.println(side[i] + " " + side[i + 1] + " " + side[i + 2]);
                return;
            }
        }
        System.out.println("No solution");
    }
}
