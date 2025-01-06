  import java.util.Stack;
public class Push_At_Bottom {

           public static void pust_At_Bottom(Stack<Integer> s1,int data){
             if (s1.isEmpty()) {
                s1.push(data);
                return;
             }
            int top=s1.pop();
            pust_At_Bottom(s1, data);
            s1.push(top);
           }
    public static void main(String[] args) {
         Stack s1=new Stack<>();
         s1.push(10);
         s1.push(20);
         s1.push(40);
         pust_At_Bottom(s1, 30);
         while (!s1.isEmpty()) {
            System.out.println("Top of the stack is "+s1.pop());
         }
    }
}
