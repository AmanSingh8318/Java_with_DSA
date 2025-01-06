import java.util.ArrayList;
public class Activityof_n{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
         // step 1 sort the end point  so here we dont need to be sort the end 
         // beacuase in this que end is alreay sorted 

         // initalize the max_count to count the activity and always store A0 which is 1 
         int max_count=1;
         // create a ans array using arraylist 
         ArrayList<Integer>ans=new ArrayList<>();
         ans.add(0);

         // initalize the lastcount 
         int lastcount=end[0];


         for (int i = 0; i < end.length; i++) {
            if (start[i]>=lastcount) {
                max_count++;
                ans.add(i);
                lastcount=end[i];
            }
         }

         System.out.println("Total posiible activites is "+max_count);

         for (int i = 0; i <ans.size(); i++) {
            System.out.print("A"+ans.get(i)+"  ");
         }
    }
}