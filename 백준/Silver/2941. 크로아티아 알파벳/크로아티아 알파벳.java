import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();

        int cnt = 0;
        for (String s : arr) {
            while (str.contains(s)) {
                str = str.replaceFirst(s, " ");
                cnt++;
            }
        }
        str = str.replace(" ", "");
        cnt += str.length();

        sb.append(cnt);
        System.out.println(sb);
    }
}