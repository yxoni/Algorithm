import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private int N;
    private int M;
    private boolean[][] visited;
    private int[] dx = {0, 0, -1, 1};
    private int[] dy = {-1, 1, 0, 0};

    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N][M];

        return bfs(maps);
    }

    public int bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            int cnt = tmp[2];

            if (x == N - 1 && y == M - 1) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny, cnt + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}
