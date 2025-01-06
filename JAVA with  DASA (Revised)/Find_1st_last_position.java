public class Find_1st_last_position {
  
                     public static int[] search_sorted(int nums[],int target){
                         int res[]={-1,-1}; // if res is not found 

//  int res[]=new int[nums.length];

                         
                           // find the fisrt occurence 
                        for (int i = 0; i < nums.length; i++) {
                                if (nums[i]==target ) {
                                    res[0]=i;
                                    break;
                                }
                                
                     }

                       // find the last occurence 
                       for(int i=nums.length-1;i>=0;i--){
                        if (nums[i]==target || nums.length==1 && target==1) {
                            res[1]=i;
                            break;
                        }

                      }

                      return res;
                }

     public static void main(String[] args) {
        // int nums[]={5,7,7,8,8,10};
        int nums[]={1};
        int target=1;

        int main_res[]=search_sorted(nums, target);
;
        for (int i = 0; i < main_res.length; i++) {
            System.out.println(main_res[i]);
        }
     }
}
