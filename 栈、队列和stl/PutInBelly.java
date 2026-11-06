import java.util.Arrays;
import java.util.Scanner;

public class PutInBelly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] valueA = new int[n];
        int[] difference = new int[n];
        for (int i = 0; i < n; i++) {
            valueA[i] = sc.nextInt();
        }
        long total = 0;
        for (int i = 0; i < n; i++) {
            int valueB = sc.nextInt();
            total += valueB;
            difference[i] = valueA[i] - valueB;
        }
        Arrays.sort(difference);
        for (int i = n - k; i < n; i++) {
            total += difference[i];
        }
        System.out.println(total);
    }
}
