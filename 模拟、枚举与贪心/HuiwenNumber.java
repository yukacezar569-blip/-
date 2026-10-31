import java.util.Scanner;

public class HuiwenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        int total = 0;
        int oddCount = 0;
        int middleNumber = -1;
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
            total += number[i];
            if (number[i] % 2 == 1) {
                oddCount++;
                middleNumber = i;
            }
        }
        if (total == 1) {
            System.out.println(middleNumber);
            return;
        }
        if (oddCount > 1) {
            System.out.println(-1);
            return;
        }
        int firstNumber = -1;
        for (int i = 1; i < 10; i++) {
            if (number[i] >= 2) {
                firstNumber = i;
                break;
            }
        }
        if (firstNumber == -1) {
            System.out.println(-1);
            return;
        }
        StringBuilder left = new StringBuilder();
        left.append(firstNumber);
        number[firstNumber] -= 2;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < number[i] / 2; j++) {
                left.append(i);
            }
        }
        StringBuilder answer = new StringBuilder(left);
        if (middleNumber != -1) {
            answer.append(middleNumber);
        }
        answer.append(left.reverse());
        System.out.println(answer);
    }
}
