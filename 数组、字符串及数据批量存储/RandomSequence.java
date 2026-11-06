import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RandomSequence {
    static BufferedReader reader;
    static StringTokenizer word;

    public static int nextNumber() throws IOException {
        while (word == null || !word.hasMoreTokens()) {
            word = new StringTokenizer(reader.readLine());
        }
        return Integer.parseInt(word.nextToken());
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        word = null;
        int T = nextNumber();
        while (T-- > 0) {
            int n = nextNumber();
            int[] number = new int[n];
            int maxNumber = Integer.MIN_VALUE;
            int minNumber = Integer.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                number[i] = nextNumber();
                sum += number[i];
                maxNumber = Math.max(maxNumber, number[i]);
                minNumber = Math.min(minNumber, number[i]);
            }
            double average = (double) sum / n;
            double variance = 0;
            for (int i = 0; i < n; i++) {
                double difference = number[i] - average;
                variance += difference * difference;
            }
            variance /= n;
            System.out.printf("%d %.3f%n", maxNumber - minNumber, variance);
        }
    }
}
