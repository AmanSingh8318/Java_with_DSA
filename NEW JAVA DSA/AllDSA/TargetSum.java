public class TargetSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int sumTarget=9;
        
        for(int i =0;i<nums.length;i++){
       for(int j=0;j<nums.length;j++){
        if (nums[i]+nums[j]==sumTarget) {
            System.out.println("The target  no of  pair is "+ nums[i]+nums[j]+"is that "+sumTarget);

        }
       }           
        }
    }
}