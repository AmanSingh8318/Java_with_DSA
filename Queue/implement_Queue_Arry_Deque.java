  import java.util.ArrayDeque;
import java.util.Queue;

public class implement_Queue_Arry_Deque {
    public static void main(String[] args) {
        Queue<Integer> q1=new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3); 
         
            while (!q1.isEmpty()) {
                System.out.println(q1.peek());
                q1.remove();
            }
    }

}
