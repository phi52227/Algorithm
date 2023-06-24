import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));
        System.out.println(remain(num1, num2));
    }
    
    public static int add (int a, int b){
        return a + b;
    }
    
    public static int subtract (int a, int b){
        return a - b;
    }
    
    public static int multiply (int a, int b){
        return a * b;
    }
    
    public static int divide (int a, int b){
        return a / b;
    }
    
    public static int remain (int a, int b){
        return a % b;
    }
}