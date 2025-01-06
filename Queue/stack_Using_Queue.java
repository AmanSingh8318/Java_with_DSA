/**
 * stack_Using_Queue
 */
import java.util.LinkedList;
import java.util.Queue;
public class stack_Using_Queue {

               public static class stack{
                static   Queue<Integer> q1=new LinkedList<>();
               static    Queue<Integer> q2=new LinkedList<>();

                    public static boolean is_empty(){
                        return q1.isEmpty();
                    }
                     
                                                    public static void Add(int data){
                                                        q2.add(data);
                                                        while (!q1.isEmpty()) {
                                                            q2.add(q1.remove());
                                                        }
                                                        
                                                        Queue<Integer> temp=q1;
                                                        q1=q2;
                                                        q2=temp;
                                                            
                                                    }

                    public static int peek(){
                        if (is_empty()) {

                            return -1;
                        }
                        return q1.peek();
                    }
                                                        public static int remove(){
                                                            if (is_empty()) {
                                                                System.out.println("Queue is empty");
                                                                return -1;
                                                            }
                                                            return q1.remove();
                                                        }
                }

     public static void main(String[] args) {
        stack s1=new stack();
        s1.Add(1);
        s1.Add(2);
        s1.Add(3);

          while (! s1.is_empty()) {
            System.out.println(s1.peek());
            s1.remove();
          }
        
     }
}