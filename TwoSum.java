public class TwoSum {
    
    public static void main(String args[]){
        
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum, index1=0, index2=0;
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length-1; j++){
                sum = nums[i] + nums[j+1];
                if(sum == target){
                    index1 = i; index2 = j+1;
                    break;
                }
            }
        }
        ret[0] = index1;
        ret[1] = index2;
 
        return ret;
    }
}
