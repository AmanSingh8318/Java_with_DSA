 import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class REverse_kth_queue {

                      public static void Reverse(Deque<Integer>d1,int k){
                        Stack<Integer>s1= new Stack<>();
                        int size=d1.size();
                     // move the first k element from the qequeue to stack
                        for (int i = 0; i <k; i++) {
                            s1.push(d1.remove());
                        }
                        //pop the elments from the stack and move back to the dequeue
                        while (!s1.isEmpty()) {
                            d1.addLast(s1.pop());
                        }
                        //to cover the rest of the element 
                        
                        for (int i = 0; i <size-k; i++) {
                            d1.addLast(d1.removeFirst());

                        }
                      }
    public static void main(String[] args) {
        Deque<Integer> d1=new LinkedList<>();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
        d1.add(60);
        d1.add(70);
        d1.add(80);
        d1.add(90);
        d1.add(100);
        Reverse(d1, 2);
        while (!d1.isEmpty()) {
            System.out.print(d1.remove()+"  ");
        }

    }
}
