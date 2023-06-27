import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dices = sc.nextLine();
        System.out.println(dice(dices));
    }
    
    public static int dice (String dices){
        String[] array = dices.split(" ");
        int result = 0;
        int[] nums = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        if (nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[0]){
            result = 10000 + nums[0] * 1000;
        } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[2] != nums[0]) {
            result = nums[2] * 100;
        } else {
            result = 1000 + nums[1] * 100;
        }
        return result;
    }
}