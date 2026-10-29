import java.util.Scanner;

public class CountNumber {
    public static int countTwo(int n) {
        int res = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                res++;
            }
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int total = 0;
        for (int i = L; i <= R; i++) {
            total += countTwo(i);
        }
        System.out.println(total);
    }
}
