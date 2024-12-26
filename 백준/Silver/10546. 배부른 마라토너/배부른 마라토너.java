import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> runners = new HashMap<>();

        for (int i = 0; i < N + (N-1); i++) {
            String runner = br.readLine();

            if (runners.containsKey(runner)) {
                runners.put(runner, runners.get(runner)+1);
            } else {
                runners.put(runner, 1);
            }
        }

        for (String s : runners.keySet()) {
            if (runners.get(s) % 2 == 1) {
                sb.append(s);
                break;
            }
        }

        System.out.println(sb);
    }
}