import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        char[] redChars = br.readLine().toCharArray();
        char[] blueChars = redChars.clone();

        int red = 0;
        int blue = 0;
        for (int i = N - 2; i >= 0; i--) {
            if (redChars[i] == 'R' && (redChars[i] != redChars[i + 1])) {
                red++;
                redChars[i] = 'B';
            } else if (blueChars[i] == 'B' && (blueChars[i] != blueChars[i + 1])) {
                blue++;
                blueChars[i] = 'R';
            }
        }

        sb.append(Math.min(red, blue));
        System.out.println(sb);
    }
}