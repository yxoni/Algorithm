import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        if (str.length() %3 != 0) {
            for (int i = 0; i < str.length()%3; i++) {
                str = "0" + str;
            }
        }

        String s;
        int result;
        for (int i = 0; i < str.length(); i += 3) {
            result = 0;
            s = str.substring(i, i+3);
            if(s.charAt(0) == '1') result += 4;
            if(s.charAt(1) == '1') result += 2;
            if(s.charAt(2) == '1') result += 1;
            sb.append(result);
        }
        System.out.println(sb);
    }
}