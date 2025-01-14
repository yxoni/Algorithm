import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> people = new HashMap<>();
        List<String> noHearNoLook = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            people.put(br.readLine(), 1);
        }
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (people.containsKey(input)) {
                noHearNoLook.add(input);
            }
        }
        Collections.sort(noHearNoLook);

        sb.append(noHearNoLook.size()).append("\n");
        noHearNoLook.forEach(s -> sb.append(s).append("\n"));
        System.out.println(sb);
    }
}