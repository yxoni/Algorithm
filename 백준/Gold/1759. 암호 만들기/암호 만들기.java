import java.io.*;
import java.util.*;

public class Main {

    static String[] check = {"a", "e", "i", "o", "u"};
    static String[] arr;
    static String[] str;
    static int L, C;

    public static void perm(int idx, int depth) {
        if (depth == L) {
            long count = Arrays.stream(check).filter(Arrays.asList(str)::contains).count();
            if (count > 0 && L-count > 1) {
                for (String s : str) {
                    System.out.print(s);
                }
                System.out.println();
            }
            return;
        }

        for (int i = idx; i < C; i++) {
            str[depth] = arr[i];
            perm(i+1, depth + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        str = new String[L];
        arr = new String[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken();
        }
        Arrays.sort(arr);
        perm(0, 0);
    }
}