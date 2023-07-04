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
        String[] arr = br.readLine().split(" ");
        String ch = br.readLine();
        int count = 0;
        for (int i = 0; i < n ; i++){
            if (arr[i].equals(ch)) count += 1;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}