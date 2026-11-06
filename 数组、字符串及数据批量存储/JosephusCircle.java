import java.util.Scanner;

public class JosephusCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        boolean[] leave = new boolean[n];
        int left = n;
        int count = 0;
        int now = k;
        while (left > 1) {
            if (!leave[now]) {
                count++;
                if (count == m) {
                    leave[now] = true;
                    left--;
                    count = 0;
                }
            }
            now = (now + 1) % n;
        }
        for (int i = 0; i < n; i++) {
            if (!leave[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
