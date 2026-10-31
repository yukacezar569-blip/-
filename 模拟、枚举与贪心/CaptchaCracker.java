import java.util.Scanner;

public class CaptchaCracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] word = {"zero", "two", "four", "six", "nine"};
        char[] number = {'0', '2', '4', '6', '9'};
        while (T-- > 0) {
            String str = sc.next();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char now = str.charAt(i);
                if (now == '0' || now == '2' || now == '4' || now == '6' || now == '9') {
                    ans.append(now);
                } else {
                    for (int j = 0; j < word.length; j++) {
                        if (str.startsWith(word[j], i)) {
                            ans.append(number[j]);
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
