import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(changeYear(year));
    }
    
    public static int changeYear (int year){
        return year - 543;
    }
}