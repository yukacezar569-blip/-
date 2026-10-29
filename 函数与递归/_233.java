import java.util.Scanner;

public class _233 {
    public static String bigMultiply(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int[] res = new int[lenA + lenB];
        for (int i = lenA - 1; i >= 0; i--) {
            int numA = a.charAt(i) - '0';
            for (int j = lenB - 1; j >= 0; j--) {
                int numB = b.charAt(j) - '0';
                int sum = numA * numB + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean start = false;
        for (int x : res) {
            if (x != 0) start = true;
            if (start) sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(bigMultiply(s1, s2));
        }
    }
}

