import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        System.out.println(add(nums));
    }
    
    public static long add (String nums){
        String[] array = nums.split(" ");
        long result = 0;
        for(int i = 0; i < array.length; i++){
            result += Long.parseLong(array[i]);
        }
        
        return result;
    }
}