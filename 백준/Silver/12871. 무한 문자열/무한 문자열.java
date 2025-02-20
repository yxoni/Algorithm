import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String t = br.readLine();

        String fs = s.repeat(t.length());
        String ft = t.repeat(s.length());
        
        int answer = 0;
        if (fs.equals(ft)) {
            answer = 1;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}