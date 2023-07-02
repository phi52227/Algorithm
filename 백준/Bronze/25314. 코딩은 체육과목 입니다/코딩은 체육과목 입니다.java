import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(longInt(num));
    }
    
    public static String longInt (int num){
        StringBuilder sb = new StringBuilder();
        int rest = num / 4;
        for (int i = 0; i < rest ; i++){
            sb.append("long ");
        }
        sb.append("int");
        String result = sb.toString();
        return result;
    }
}