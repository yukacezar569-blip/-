import java.util.Scanner;

public class CalenderNumber {
    public static boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
    public static int getDays(int y, int m) {
        int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(m == 2 && isLeap(y)) return 29;
        return mon[m-1];
    }
    public static int countDigit(long n, int x) {
        int cnt = 0;
        while(n > 0) {
            if(n % 10 == x) {
                cnt++;
            }
            n /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int maxDay = getDays(y, m);
            int ans = 0;
            for(int d = 1; d <= maxDay; d++) {
                long num = (long)y * 10000 + m * 100 + d;
                ans += countDigit(num, x);
            }
            System.out.println(ans);
        }
    }
}
