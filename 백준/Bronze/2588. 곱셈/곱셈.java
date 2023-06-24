import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        mul(num1, num2);
    }
    
    public static void mul (int a, int b){
        int units = b % 10;
        int tens = b % 100 /10;
        int hundreds = b / 100;
        
        System.out.println(a * units);
        System.out.println(a * tens);
        System.out.println(a * hundreds);
        System.out.println(a * b);
    }
}