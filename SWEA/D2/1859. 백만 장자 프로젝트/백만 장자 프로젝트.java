import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Stack;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            Stack<Long> numbers = new Stack<>();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                numbers.push(sc.nextLong());
            }
            long standard = numbers.pop();
            while (!numbers.isEmpty()) {
                long number = numbers.pop();
                if (standard > number) {
                    sum += (standard - number);
                } else {
                    standard = number;
                }
            }
            System.out.printf("#%d %d\n", test_case, sum);
        }
        sc.close();
    }
}