import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        if (line != null) {
            char[] ch = line.toCharArray();

            int n = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != '.') {
                    n++;
                } else {
                    if (n % 2 != 0) {
                        n = 0;
                        sb = new StringBuilder("-1");
                        break;
                    }
                    sb.append("AAAA".repeat(n / 4));
                    sb.append("BB".repeat(n % 4 / 2));
                    sb.append(".");
                    n = 0;
                }
            }

            if (n % 2 != 0) {
                sb = new StringBuilder("-1");
            } else {
                sb.append("AAAA".repeat(n / 4));
                sb.append("BB".repeat(n % 4 / 2));
            }
        }

        System.out.println(sb);
    }
}