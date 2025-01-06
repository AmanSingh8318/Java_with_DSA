/**
 * Two_DArraylist
 */
import java.util.ArrayList;
public class Two_DArraylist {

    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> Mainlist=new ArrayList<>();
          ArrayList<Integer> list1=new ArrayList<>();
          ArrayList<Integer> list2=new ArrayList<>();
          ArrayList<Integer> list3=new ArrayList<>();
             

           // add no in lists 
           for (int i = 1; i <=5; i++) {
             list1.add(i*1);
             list2.add(i*2);
             list3.add(i*3);
           }
           Mainlist.add(list1);
           Mainlist.add(list2);
           Mainlist.add(list3);

    for(int j=0; j<Mainlist.size()-1;j++){
            ArrayList<Integer> Current=Mainlist.get(j);
            for (int k = 0; k <Current.size(); k++) {
                System.out.print(Current.get(k)+"   ");
            }
            System.out.println();
    }       
            System.out.println();
           System.out.println(Mainlist);
    }
}