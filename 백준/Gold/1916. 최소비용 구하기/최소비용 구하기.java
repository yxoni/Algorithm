import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    Map<Integer, int[]> map = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      int[] bus = new int[N + 1];
      Arrays.fill(bus, -1);
      map.put(i, bus);
    }
    
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      int[] bus = map.get(a);
      bus[b] = bus[b] == -1 ? c : Math.min(bus[b], c);

      map.put(a, bus);
    }

    st = new StringTokenizer(br.readLine());
    int start = Integer.parseInt(st.nextToken());
    int dest = Integer.parseInt(st.nextToken());

    int[] result = dijkstra(N, start, map);
    sb.append(result[dest]);
    System.out.println(sb);
  }

  public static int[] dijkstra(int n, int start, Map<Integer, int[]> map) {
    int[] dist = new int[n + 1];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[0] = -1;
    dist[start] = 0;
    PriorityQueue<Node> q = new PriorityQueue<>();
    q.offer(new Node(start, 0));

    while (!q.isEmpty()) {
      Node cur = q.poll();
      int[] bus = map.get(cur.idx);

      for (int i = 1; i < bus.length; i++) {
        if (bus[i] == -1) continue;

        if (cur.dist + bus[i] < dist[i]) {
          dist[i] = cur.dist + bus[i];
          q.offer(new Node(i, dist[i]));
        }
      }
    }

    return dist;
  }

  public static class Node implements Comparable<Node> {
    int idx;
    int dist;

    public Node(int idx, int dist) {
      this.idx = idx;
      this.dist = dist;
    }

    @Override
    public int compareTo(Node e) {
      return this.dist - e.dist;
    }
  }
}