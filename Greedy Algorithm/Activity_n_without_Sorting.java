import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Activity_n_without_Sorting
 */
public class Activity_n_without_Sorting {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        // 1 step sort the end point 
        int activites[][]=new int[start.length][3];
        for (int i = 0; i <start.length; i++) {
             activites[i][0]=i; // stores the indexex 
             activites[i][1]=start[i]; // stores the starting point 
             activites[i][2]=end[i]; // stores the ending point       
        }
        // now sort the 2d araay using lambda function 
        Arrays.sort(activites,Comparator.comparingDouble(o->o[2]));
        int cout=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(activites[1][0]);
        int prevEnd=activites[0][2];

         for (int i = 1; i <start.length; i++) {
             if (activites[i][1] >= prevEnd) {
               cout++;
               ans.add(activites[i][0]);
               prevEnd=activites[i][2];  
             }
         }
          System.out.println(cout);
          for (int i = 0; i <ans.size(); i++) {
            System.out.print("A"+ans.get(i) +" ");
          }
    }
}