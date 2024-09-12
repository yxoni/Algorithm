import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        String str;
        for(int i = 0; i < T; i++) {
            str = br.readLine();

            for (String s : str.split(" ")) {
                for(int j = s.length()-1; j >= 0; j--) {
                    bw.write(s.charAt(j));
                }
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}