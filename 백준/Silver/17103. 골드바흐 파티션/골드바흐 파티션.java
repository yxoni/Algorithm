import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;
        for (int i = 0; i < Math.sqrt(arr.length); i++) {
            if(arr[i]) continue;
            for (int j = i+i; j < arr.length; j+=i) {
                arr[j] = true;
            }
        }

        int N;
        int count;
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            count = 0;
            for (int j = 2; j < N/2+1; j++) {
                if(!arr[j] && !arr[N-j]) count++ ;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}