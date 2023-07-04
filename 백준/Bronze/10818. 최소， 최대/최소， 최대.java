import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000; 
        int max = -1000000;
        int x = 0;
        for (int i = 0; i < n ; i++){
            x = Integer.parseInt(st.nextToken());
            if (x < min) min = x;
            if (x > max) max = x;
        }
        String result = String.valueOf(min) + " " + String.valueOf(max);
        bw.write(result);
        bw.flush();
        bw.close();
    }
}