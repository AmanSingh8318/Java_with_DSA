 import java.util.ArrayList;
import java.util.Collections;
public class Sorting_IN_ArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         list.add(5);
         list.add(3);
         list.add(9);
         list.add(11);
         list.add(2);
         System.out.println("Before Sorting  "+list);
         Collections.sort(list);
         System.out.println("After Sorting   "+list);

         // sort in descending order 

         Collections.sort(list,Collections.reverseOrder());

         System.out.println("No inDescending order   "+list);
    }
}
