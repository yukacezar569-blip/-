import java.util.Scanner;

public class RemoveComments {
    public static String removeComments(String code) {
        StringBuilder result = new StringBuilder();
        boolean inString = false;
        int i = 0;
        while (i < code.length()) {
            char now = code.charAt(i);
            if (now == '"' && (i == 0 || code.charAt(i - 1) != '\\')) {
                inString = !inString;
            }
            if (!inString && now == '/' && i + 1 < code.length() && code.charAt(i + 1) == '*') {
                int end = code.indexOf("*/", i + 2);
                if (end == -1) {
                    result.append(code.substring(i));
                    break;
                }
                i = end + 2;
                continue;
            }
            result.append(now);
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\A");
        String code = sc.hasNext() ? sc.next() : "";
        System.out.print(removeComments(code));
    }
}
