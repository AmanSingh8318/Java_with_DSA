 import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Traverse_Queue {

                public static void traverse(Queue<Integer> q1){
                       Stack<Integer> s1=new Stack<>();
                     while (!q1.isEmpty()) {
                    s1.add(q1.remove());
                     }
                     while (!s1.isEmpty()) {
                        q1.add(s1.pop());

                        }
                }
      public static void main(String[] args) {

        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        traverse(q1);
         while (!q1.isEmpty()) {
            System.out.print(q1.remove()+"  ");
         }
      }
}
