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
        String str = "";
        int a, b = 0;
        String check = "";
        while ((check=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(check);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            str = String.valueOf(a+b);
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}