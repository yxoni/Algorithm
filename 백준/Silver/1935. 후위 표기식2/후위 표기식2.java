import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Double> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double calc;
        double num;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                s.push(arr[str.charAt(i)-'A']);
            } else {
                switch (str.charAt(i)) {
                    case '+':
                        calc = s.pop() + s.pop();
                        s.push(calc);
                        break;
                    case '-':
                        num = s.pop();
                        calc = s.pop() - num;
                        s.push(calc);
                        break;
                    case '*':
                        calc = s.pop() * s.pop();
                        s.push(calc);
                        break;
                    case '/':
                        num = s.pop();
                        calc = s.pop() / num;
                        s.push(calc);
                        break;
                }
            }
        }
        String result = String.format("%.2f", s.pop());
        bw.write(result);
        bw.flush();
        bw.close();
    }
}