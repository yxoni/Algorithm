import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            if (map.containsKey(color)) {
                map.get(color).add(location);
            } else {
                map.put(color, new ArrayList<>(List.of(location)));
            }
        }

        int result = 0;
        for (Integer i : map.keySet()) {
            List<Integer> locations = map.get(i);
            Collections.sort(locations);

            for (int j = 0; j < locations.size(); j++) {
                if (j == 0) {
                    result += locations.get(1) - locations.get(0);
                } else if (j == locations.size()-1) {
                    result += locations.get(j) - locations.get(j-1);
                } else {
                    int min = Math.min(locations.get(j) - locations.get(j-1), locations.get(j+1) - locations.get(j));
                    result += min;
                }
            }
        }
        
        sb.append(result);
        System.out.println(result);

    }
}