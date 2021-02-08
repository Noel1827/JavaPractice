import java.util.*;
public class threeSum {
    public static void main(String args[]){

    }
    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0, num1=0, num2=0, num3=0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length-1; j++){
                for(int k = j; k < nums.length-2; k++){
                    sum += nums[i] + nums[j+1] + nums[k+2];
                    if(sum == 0){
                        num1 = nums[i];
                        num2 = nums[j+1];
                        num3 = nums[k+2];
                        break;
                    }
                }
            }
        }
        
    }
}
