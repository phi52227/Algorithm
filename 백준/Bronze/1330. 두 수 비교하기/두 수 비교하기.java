import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        System.out.println(comp(nums));
    }
    
    public static String comp (String nums){
        String[] array = nums.split(" ");
        String result = "";
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if (a == b){
            result = "==";
        } else if (a > b) {
            result = ">";
        } else {
            result = "<";
        }
        return result;
    }
}