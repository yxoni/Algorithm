import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int n = sc.nextInt();
            int[] buil = new int[n];
            int result = 0;
            for (int i = 0; i < n; i++) {
                buil[i] = sc.nextInt();
            }
            for (int i = 2; i < n-2; i++) {
                if (buil[i-2] < buil[i] && buil[i-1] < buil[i] &&
                        buil[i+1] < buil[i] && buil[i+2] < buil[i]) {
                    int max = Math.max(buil[i-2], buil[i-1]);
                    max = Math.max(max, buil[i+1]);
                    max = Math.max(max, buil[i+2]);
                    result += (buil[i] - max);
                }
            }
            System.out.printf("#%d %d\n", test_case, result);
        }
        sc.close();
    }
}