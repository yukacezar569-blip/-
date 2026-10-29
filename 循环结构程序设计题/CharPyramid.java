import java.util.Scanner;

public class CharPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int max = c - 'A';
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < max - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}

