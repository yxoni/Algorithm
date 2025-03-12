import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        List<Integer> number = new ArrayList<>();
        List<String> sign = new ArrayList<>();

        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+' && str.charAt(i) != '-') {
                s += str.charAt(i);
            } else {
                number.add(Integer.parseInt(s));
                sign.add(String.valueOf(str.charAt(i)));
                s = "";
            }
        }
        number.add(Integer.parseInt(s));

        int idx = 0;
        while (!sign.isEmpty()) {
            if ((idx = sign.indexOf("+")) >= 0) {
                number.set(idx, number.get(idx) + number.get(idx + 1));
                number.remove(idx + 1);
            } else {
                idx = sign.indexOf("-");
                number.set(idx, number.get(idx) - number.get(idx + 1));
                number.remove(idx + 1);
            }
            sign.remove(idx);
        }

        sb.append(number.get(0));
        System.out.println(sb);
    }
}