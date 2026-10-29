import java.util.Scanner;

public class Huiwenprime {
    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(long i = 3; i * i <= n; i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long getHuiwen(long t) {
        long temp = t / 10;
        long suffix = 0;
        while(temp > 0){
            suffix = suffix * 10 + temp % 10;
            temp /= 10;
        }
        long pow10 = 1;
        long tmp = suffix;
        while(tmp > 0){
            pow10 *= 10;
            tmp /= 10;
        }
        return t * pow10 + suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long p = getHuiwen(t);
        System.out.println(isPrime(p) ? "prime" : "noprime");
        sc.close();
    }
}