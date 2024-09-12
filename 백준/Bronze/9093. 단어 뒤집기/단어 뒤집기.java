import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        List<String> list;
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();

            while(st.hasMoreTokens()) {
                list.add(st.nextToken());
            }

            for(int j = 0; j < list.size(); j++) {
                for (int k = list.get(j).length() - 1; k >= 0; k--) {
                    bw.write(list.get(j).charAt(k));
                }
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}