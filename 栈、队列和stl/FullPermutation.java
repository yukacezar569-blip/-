public class FullPermutation {
    public static void arrange(int position, int[] number, boolean[] used, StringBuilder ans) {
        if (position == 8) {
            for (int i = 0; i < 8; i++) {
                if (i > 0) ans.append(' ');
                ans.append(number[i]);
            }
            ans.append('\n');
            return;
        }
        for (int i = 1; i <= 8; i++) {
            if (!used[i]) {
                number[position] = i;
                used[i] = true;
                arrange(position + 1, number, used, ans);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] number = new int[8];
        boolean[] used = new boolean[9];
        StringBuilder ans = new StringBuilder();
        arrange(0, number, used, ans);
        System.out.print(ans);
    }
}
