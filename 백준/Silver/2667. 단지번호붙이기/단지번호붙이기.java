import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static boolean[][] map;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    public static class House {
        int x;
        int y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                if (input[j].equals("1")) {
                    map[i][j] = true;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j]) {
                    result.add(dfs(i, j));
                }

            }
        }

        Collections.sort(result);
        sb.append(result.size()).append(System.lineSeparator());
        result.forEach(i -> sb.append(i).append(System.lineSeparator()));
        System.out.println(sb);
    }

    public static int dfs(int x, int y) {
        Queue<House> queue = new LinkedList<>();
        queue.offer(new House(x, y));
        map[x][y] = false;

        int cnt = 0;
        while (!queue.isEmpty()) {
            House house = queue.poll();
            cnt++;

            for (int i = 0; i < 4; i++) {
                int nx = house.x + dx[i];
                int ny = house.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny]) {
                    queue.offer(new House(nx, ny));
                    map[nx][ny] = false;
                }
            }
        }

        return cnt;
    }
}