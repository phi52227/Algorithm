import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(mul(num1, num2));
    }
    
    public static int mul (int a, int b){
        return a * b;
    }
}