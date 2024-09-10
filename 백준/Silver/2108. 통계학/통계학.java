import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        bw.write(String.valueOf(Math.round((double)sum/N))+"\n");
        bw.write(String.valueOf(arr[N/2])+"\n");

        int count = 1;
        int max = 1;
        List<Integer> list = new ArrayList<>();
        if(N == 1) list.add(arr[0]);
        for(int i = 1; i < N; i++) {
            if (arr[i-1] == arr[i])  {
                count++;
                if (i == N-1) {
                    if (count == max) list.add(arr[i]);
                    else if (count > max) {
                        list.clear();
                        list.add(arr[i]);
                    }
                }
            }
            else {
                if (max == count) {
                    list.add(arr[i-1]);
                    if ((i == N-1) && (count == 1)) list.add(arr[i]);
                } else if (max < count) {
                    max = count;
                    list.clear();
                    list.add(arr[i-1]);
                }
                count = 1;
            }
        }

        bw.write(String.valueOf(list.size() > 1 ? list.get(1) : list.get(0))+"\n");
        bw.write(String.valueOf(arr[N-1]-arr[0])+"\n");

        bw.flush();
        bw.close();
    }
}