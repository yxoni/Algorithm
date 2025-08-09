import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int[] dist = dijkstra(n, edge);
        
        int max = Arrays.stream(dist)
            .max()
            .orElse(0);
        int answer = (int) Arrays.stream(dist)
            .filter(i -> i == max)
            .count();
        
        return answer;
    }
    
    public int[] dijkstra(int n, int[][] edge) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = -1;
        dist[1] = 0;
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(1, 0));
        
        while (!q.isEmpty()) {
            Node cur = q.poll();
            
            for (int[] arr : edge) {
                if (arr[0] == cur.idx || arr[1] == cur.idx) {
                    int nextIdx = arr[0] == cur.idx ? arr[1] : arr[0];
                    if (cur.dist + 1 < dist[nextIdx]) {
                        dist[nextIdx] = cur.dist + 1;
                        q.offer(new Node(nextIdx, cur.dist + 1));
                    }
                }
            }
        }
        
        return dist;
    }
    
    public class Node implements Comparable<Node> {
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