import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            arr[c - 'a']++;
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

    }
}