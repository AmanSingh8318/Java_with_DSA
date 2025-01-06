public class Integer_arr_return {
    public static void main(String[] args) {
        int []nums = {4,  5, 6, 7, 0, 1, 2};
         int target = 0;

        // Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
              if (i==target) {
                  System.out.println(nums[i]);
                  break;
              }
        }

        

    }
}
