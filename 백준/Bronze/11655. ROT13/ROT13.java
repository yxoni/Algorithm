import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                if ((Character.isUpperCase(c) && (c + 13 > 'Z'))
                        || (Character.isLowerCase(c) && (c + 13 > 'z'))) c = (char) (c - 13);
                else c = (char) (c + 13);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}