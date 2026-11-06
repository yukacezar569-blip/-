import java.util.Arrays;
import java.util.Scanner;

public class JoinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] number = new String[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.next();
        }
        Arrays.sort(number, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder ans = new StringBuilder();
        for (String now : number) {
            ans.append(now);
        }
        System.out.println(ans);
    }
}
