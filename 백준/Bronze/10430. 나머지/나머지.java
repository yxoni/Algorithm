import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf((A+B)%C)+"\n");
        bw.write(String.valueOf(((A%C) + (B%C))%C)+"\n");
        bw.write(String.valueOf((A*B)%C)+"\n");
        bw.write(String.valueOf(((A%C) * (B%C))%C)+"\n");

        bw.flush();
        bw.close();


    }
}