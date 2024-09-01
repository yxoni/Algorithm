import java.io.*;
import java.util.*;

public class Main {
    public static int binarySearch(int[] arr, int key, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if(key == arr[mid]) {
                return 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.valueOf(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num;
        int mid;
        for(int i = 0; i < M; i++) {
            num = Integer.valueOf(st.nextToken());
            bw.write(String.valueOf(binarySearch(arr, num, 0, N-1))+"\n");
        }
        bw.flush();
        bw.close();
    }
}