import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println(div(num1, num2));
    }
    
    public static double div (double a, double b){
        return a / b;
    }
}