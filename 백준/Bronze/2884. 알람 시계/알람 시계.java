import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        System.out.println(alarm(nums));
    }
    
    public static String alarm (String nums){
        String[] array = nums.split(" ");
        String result = "";
        int min = Integer.parseInt(array[1]) - 45;
        int hour = Integer.parseInt(array[0]);
        if (min < 0){
            min = 60 + min;
            hour--;
        }
        if (hour < 0) {
            hour = 24 + hour;
        }
        result = hour + " " + min;
        return result;
    }
}