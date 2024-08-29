import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static class Coord implements Comparable<Coord> {
        private int x;
        private int y;
        
        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int compareTo(Coord other) {
            int compare = Integer.compare(this.y, other.y);
            if (compare == 0) {
                return Integer.compare(this.x, other.x);
            } else {
                return compare;
            }
        }
        
        public String toString() {
            return x + " " + y + "\n";
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        Coord[] coords = new Coord[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            coords[i] = new Coord(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        Arrays.sort(coords);
        for(Coord coord : coords) {
            bw.write(coord.toString());
        }
        bw.flush();
        bw.close();
        
    }
}