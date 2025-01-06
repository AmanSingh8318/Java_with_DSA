 import java.util.Deque;
import java.util.LinkedList;
public class Dequeue {
      public static void main(String[] args) {
        Deque<Integer> d1=new LinkedList<>();
        d1.addFirst(1);
        d1.addFirst(2);
        d1.addFirst(3);
        d1.addFirst(4);
        
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
             
        System.out.println("Firt element of Deque" +d1.getFirst());
        System.out.println("Last element of the deque" +d1.getLast());

      }
}
