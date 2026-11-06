import java.util.Scanner;

public class OutsideTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int M = sc.nextInt();
        boolean[] remove = new boolean[L + 1];
        for (int i = 0; i < M; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int j = left; j <= right; j++) {
                remove[j] = true;
            }
        }
        int total = 0;
        for (int i = 0; i <= L; i++) {
            if (!remove[i]) {
                total++;
            }
        }
        System.out.println(total);
    }
}
