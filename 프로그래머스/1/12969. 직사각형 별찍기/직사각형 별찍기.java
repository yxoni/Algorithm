import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str[] = br.readLine().split(" ");  
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        for (int i = 0; i < m; i++) {
            sb.append("*".repeat(n))
                .append(System.lineSeparator());
        }
        
        System.out.println(sb);
    }
}