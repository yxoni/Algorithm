import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[10000001];
        arr[0] = arr[1] = true;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) continue;
            for (int j = i+i; j < arr.length; j+=i) {
                arr[j] = true;
            }
        }
        int i = 2;
        while(N != 1) {
            if (!arr[i] && N%i == 0) {
                N /= i;
                bw.write(i+"\n");
            } else i++;
        }
        bw.flush();
        bw.close();
    }
}