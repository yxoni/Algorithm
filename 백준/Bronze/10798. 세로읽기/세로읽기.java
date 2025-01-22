import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] one = br.readLine().toCharArray();
        char[] two = br.readLine().toCharArray();
        char[] three = br.readLine().toCharArray();
        char[] four = br.readLine().toCharArray();
        char[] five = br.readLine().toCharArray();

        int i = 0;
        while (true) {
            if (i < one.length) {
                sb.append(one[i]);
            }
            if (i < two.length) {
                sb.append(two[i]);
            }
            if (i < three.length) {
                sb.append(three[i]);
            }
            if (i < four.length) {
                sb.append(four[i]);
            }
            if (i < five.length) {
                sb.append(five[i]);
            }
            i++;
            if (i == 16) {
                break;
            }
        }
        
        System.out.println(sb);
    }
}