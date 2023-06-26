import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));
    }
    
    public static int leapYear (int year){
        int result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0 ;
        return result;
    }
}