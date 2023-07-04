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
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = arr[0]; 
        int max = min;
        for (int i = 0; i < n ; i++){
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }
        String result = String.valueOf(min) + " " + String.valueOf(max);
        bw.write(result);
        bw.flush();
        bw.close();
    }
}