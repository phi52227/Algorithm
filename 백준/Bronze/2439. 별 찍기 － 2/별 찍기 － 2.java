import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String star = "*";
        String space = " ";
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n; j++){
                if (j <= (n - i)){
                    bw.write(space);
                } else {
                bw.write(star);
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}