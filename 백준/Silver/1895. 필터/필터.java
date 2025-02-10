import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] tmp = new int[9];
        int[][] result = new int[R - 2][C - 2];
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                tmp[0] = arr[i + 0][j + 0];
                tmp[1] = arr[i + 0][j + 1];
                tmp[2] = arr[i + 0][j + 2];

                tmp[3] = arr[i + 1][j + 0];
                tmp[4] = arr[i + 1][j + 1];
                tmp[5] = arr[i + 1][j + 2];

                tmp[6] = arr[i + 2][j + 0];
                tmp[7] = arr[i + 2][j + 1];
                tmp[8] = arr[i + 2][j + 2];

                Arrays.sort(tmp);
                result[i][j] = tmp[4];
            }
        }

        int T = Integer.parseInt(br.readLine());
        int answer = (int) Arrays.stream(result).flatMapToInt(Arrays::stream).filter(i -> i >= T).count();

        sb.append(answer);
        System.out.println(sb);
    }
}