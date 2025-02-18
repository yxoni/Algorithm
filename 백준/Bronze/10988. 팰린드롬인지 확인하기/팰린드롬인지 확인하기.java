import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int endIdx = str.length() - 1;
        int answer = 1;
        for (int i = 0; i < str.length()/2; i++) {
            if (!(str.charAt(i) == str.charAt(endIdx - i))) {
                answer = 0;
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}