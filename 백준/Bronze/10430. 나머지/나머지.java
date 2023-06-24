import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(remain(add(a,b), c));
        System.out.println(remain(add(remain(a, c), remain(b, c)) ,c));
        System.out.println(remain(multipy(a,b), c));
        System.out.println(remain(multipy(remain(a, c), remain(b, c)) ,c));
    }
    
    public static int add (int a, int b){
        return a + b;
    }
    
    public static int multipy (int a, int b){
        return a * b;
    }
    
    public static int remain (int a, int b){
        return a % b;
    }
}