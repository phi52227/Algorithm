import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int time = sc.nextInt();
        System.out.println(alarm(nums, time));
    }
    
    public static String alarm (String nums, int time){
        String[] array = nums.split(" ");
        String result = "";
        int min = Integer.parseInt(array[1]) + time;
        int hour = Integer.parseInt(array[0]);
        hour = (hour + (min / 60)) % 24;
        min = min % 60;
        result = hour + " " + min;
        return result;
    }
}