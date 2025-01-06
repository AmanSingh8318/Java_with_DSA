 import java.util.Deque;
import java.util.LinkedList;
public class Stack_Using_deQueue {
             
               public static class Stack{
                   Deque<Integer>d1=new LinkedList<>();
                public void Push(int data){
                        d1.addLast(data);
                }

                 public int pop(){
                    return d1.removeLast();
                 }


                 public int peek(){
                    return d1.getLast();
                 }
               }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.Push(1);
        s1.Push(2);
        s1.Push(3);
          
          while (!s1.d1.isEmpty()) {
            System.out.println(s1.pop());
          }
    }
}
