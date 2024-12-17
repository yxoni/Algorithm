import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alpha = new int[26];
        int idx;
        int isOdd = 0;
        int isOddIdx = -1;

        char[] ch = br.readLine().toCharArray();
        for (char c : ch) {
            idx = c - 'A';
            alpha[idx]++;
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 == 1) {
                isOddIdx = i;
                isOdd++;
            }
        }

        if (isOdd > 1) {
            sb.append("I'm Sorry Hansoo");
        } else {
            for (int i = 0; i < alpha.length; i++) {
                for (int j = 0; j < alpha[i] / 2; j++) {
                    sb.append((char) (i + 65));
                }
            }
            String end = String.valueOf(sb.reverse());
            sb.reverse();

            if (isOdd == 1) {
                sb.append((char) (isOddIdx + 65));
            }
            sb.append(end);
        }

        System.out.println(sb);
    }
}