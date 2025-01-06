   import java.util.Deque;
import java.util.LinkedList;
 public class Rope_problem {

           public static int Rope_cost(Deque<Integer>d1){
            // int i=0;
            int res=0;
                    int cost=0;
                    
               while (d1.size()>1) {
                 int first=d1.removeFirst();
                 int sec=d1.removeFirst();
            cost=first+sec;
            res+=cost;
            d1.addLast(cost);
                    

                 }
               return res;

           }
    public static void main(String[] args) {
        // int arr[]={4,3,2,6};
        Deque<Integer> d1=new LinkedList<>();
        d1.add(4);
        d1.add(3);
        d1.add(2);
        d1.add(6);
      
        // Rope_cost(d1,n);
        System.out.println(Rope_cost(d1));
    }
}
