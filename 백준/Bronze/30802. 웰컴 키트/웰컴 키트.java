import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String sizes = br.readLine();
        String bundle = br.readLine();
        
        StringTokenizer bundleToken = new StringTokenizer(bundle, " ");
        int t = Integer.parseInt(bundleToken.nextToken());
        int p = Integer.parseInt(bundleToken.nextToken());
        
        int tBundle = 0;
        StringTokenizer sizesToken = new StringTokenizer(sizes, " ");
        for(int i = 0; i < 6; i++) {
            int size = Integer.parseInt(sizesToken.nextToken());
            int temp = (size%t == 0 ? size/t : (size%t == size ? 1 : size/t+1));
            tBundle += temp;
        }
        
        int pBundle = num/p;
        int pUnit = num%p;
        
        bw.write(String.valueOf(tBundle));
        bw.newLine();
        bw.write(String.valueOf(pBundle)+" "+String.valueOf(pUnit));
        
        bw.flush();
        bw.close();
    }
}