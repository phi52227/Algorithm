import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayLength = Integer.parseInt(st.nextToken());
        int[] array = new int[arrayLength];
        int num = Integer.parseInt(st.nextToken());
        int start, end, value;
        for (int i = 0; i < num ; i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            value = Integer.parseInt(st.nextToken());
            for (int j = start; j <= end; j++){
                array[j-1] = value;
            }
        }
        for (int n = 0; n < array.length; n++){
            System.out.print(array[n]);
            System.out.print(" ");
        }

    }
}