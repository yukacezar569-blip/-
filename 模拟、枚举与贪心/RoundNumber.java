import java.util.Scanner;

public class RoundNumber {
    public static String getRound(String number, int t) {
        char[] score = number.toCharArray();
        int point = number.indexOf('.');
        if (point == -1) return number;
        int position = point + 1;
        int length = score.length;
        boolean addOne = false;
        while (position < length && score[position] < '5') {
            position++;
        }
        while (position < length && position > point && t > 0 && score[position] >= '5') {
            length = position;
            position--;
            t--;
            if (position == point) {
                length = point;
                position--;
                while (position >= 0 && score[position] == '9') {
                    score[position] = '0';
                    position--;
                }
                if (position >= 0) {
                    score[position]++;
                } else {
                    addOne = true;
                }
                break;
            }
            score[position]++;
        }
        while (length > point + 1 && score[length - 1] == '0') {
            length--;
        }
        if (length == point + 1) {
            length--;
        }
        String result = new String(score, 0, length);
        if (addOne) result = "1" + result;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String number = sc.next();
        System.out.println(getRound(number, t));
    }
}
