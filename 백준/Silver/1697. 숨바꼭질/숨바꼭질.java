import java.io.*;
import java.util.*;


public class Main {

    static int K;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(bfs(N)));
        bw.flush();
        bw.close();

    }

    public static int bfs(int node) {
        Queue<Integer> q = new LinkedList<>();

        q.add(node);
        int n;
        visited[node] = 1;
        
        while (!q.isEmpty()) {
            n = q.remove();

            if(n == K) return visited[n]-1;
            if(n-1 >= 0 && visited[n-1] == 0) {
                visited[n-1] = visited[n]+1;
                q.add(n-1);
            }
            if(n+1 <= 100000 && visited[n+1] == 0) {
                visited[n+1] = visited[n]+1;
                q.add(n+1);
            }
            if(2*n <= 100000 && visited[2*n] == 0) {
                visited[2*n] = visited[n]+1;
                q.add(2*n);
            }
        }
        return -1;
    }
}