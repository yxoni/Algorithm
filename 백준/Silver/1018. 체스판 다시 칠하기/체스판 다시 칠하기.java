import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int row = 0;
        int col = 0;
        int white = 0;
        int black = 0;
        int min = -1;
        while (N - row > 7) {
            while (M - col > 7) {
                for (int i = row; i < 8 + row; i++) {
                    for (int j = col; j < 8 + col; j++) {
                        if((i%2==0 && j%2==0) || (i%2==1 && j%2==1)) {
                            black += (arr[i][j] == 'B') ? 0 : 1;
                            white += (arr[i][j] == 'W') ? 0 : 1;
                        } else {
                            black += (arr[i][j] == 'B') ? 1 : 0;
                            white += (arr[i][j] == 'W') ? 1 : 0;

                        }
                    }
                }
                if (min == -1) {
                    min = Math.min(black, white);
                } else {
                    min = Math.min(min, Math.min(black, white));
                }
                black = 0;
                white = 0;
                col++;
            }
            col = 0;
            row++;
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}