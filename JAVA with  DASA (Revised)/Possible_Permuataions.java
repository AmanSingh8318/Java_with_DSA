import java.util.ArrayList;
import java.util.List;
public class Possible_Permuataions {


    public static void Find_perm(int nums[])
        {
List<Integer> temp[] = new ArrayList[nums.length];     
   for (int i = 0; i < nums.length; i++) {
              if(nums[i]!=nums[i+1] && nums[i+1]!=nums[i+2]){
                 temp[i].add(nums[i]);
              }
        }

        for (int i = 0; i <temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        Find_perm(nums);
    }
}
