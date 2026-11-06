import java.util.Scanner;

public class GoodString {
    public static boolean isGood(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now == 'a') {
                count++;
            } else if (now == 'b') {
                count--;
            } else {
                return false;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isGood(str) ? "Good" : "Bad");
    }
}
