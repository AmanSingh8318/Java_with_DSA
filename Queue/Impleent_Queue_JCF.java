import java.util.LinkedList;
import java.util.Queue;


public class Impleent_Queue_JCF {
    public static void main(String[] args) {
      Queue<Integer> q1=new LinkedList<>();
      q1.add(4);
      q1.add(5);
      q1.add(6); 

         while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
         }
       
    }
}
