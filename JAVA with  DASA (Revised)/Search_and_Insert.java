public class Search_and_Insert {


      public static int search_Insert(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }  else if (nums[i]<target) {
             return   nums[i]=target;
            }else {
               return nums[target]=i;
            }
        }
         return -1;
      }
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=7;
  int res=search_Insert(nums, target);

  System.out.println(res);
    }
}
