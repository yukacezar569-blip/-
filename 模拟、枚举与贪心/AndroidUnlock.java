import java.util.Scanner;

public class AndroidUnlock {
    public static boolean isLegal(String password) {
        boolean[] used = new boolean[10];
        for (int i = 0; i < password.length(); i++) {
            int now = password.charAt(i) - '0';
            if (used[now]) {
                return false;
            }
            if (i > 0) {
                int before = password.charAt(i - 1) - '0';
                int row = (before - 1) / 3 + (now - 1) / 3;
                int col = (before - 1) % 3 + (now - 1) % 3;
                if (row % 2 == 0 && col % 2 == 0) {
                    int middle = row / 2 * 3 + col / 2 + 1;
                    if (!used[middle]) {
                        return false;
                    }
                }
            }
            used[now] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String password = sc.next();
            System.out.println(isLegal(password) ? "YES" : "NO");
        }
    }
}
