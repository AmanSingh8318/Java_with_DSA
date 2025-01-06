 import java.util.Stack;
public class Stack_Using_JCF {
  
    public static void main(String[] args) {
       Stack<Integer> s=new Stack<>();
       s.push(20);
       s.push(30);
       s.push(40);
       s.push(50);
         while (!s.isEmpty()) {
             System.out.println("Top of the Stack is "+s.peek());
             s.pop();
         }
    }
}
