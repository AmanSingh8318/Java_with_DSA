/**
 * Implement_Using_2stack
 */
import java.util.Stack;
public class Implement_Using_2stack {

                       public static class Queue{
                          Stack<Integer> s1= new Stack<>();
                          Stack<Integer> s2 =new Stack<>();

                            
                         public  boolean is_empty(){
                            return s1.isEmpty();
                         }


                          
                                public void Add(int data){
                                       while (!s1.isEmpty()) {
                                        s2.push(s1.pop());
                                       }
                                       s1.push(data);

                                       while (!s2.isEmpty()) {
                                        s1.push(s2.pop());
                                       }
                                }

                                              public int remove(){
                                                  
                                                    if (s1.isEmpty()) {
                                                        System.out.println("Queue is empty");
                                                        return -1;
                                                    }
                                                    return s1.pop();
                                              }

                        public int peek(){
                              if (s1.isEmpty()) {
                                System.out.println("Queue is empty");
                                return -1;
                              }
                             return s1.peek();
                        }
                       }

        public static void main(String[] args) {
        Queue q1=new Queue();
        q1.Add(2);
        q1.Add(3);
        q1.Add(4);
          while (!q1.is_empty()) {
            System.out.println(q1.peek());
            q1.remove();
          }
        }
    
}