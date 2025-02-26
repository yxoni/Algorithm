import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i) - i;
            if (n > 0) {
                sum += n;
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}