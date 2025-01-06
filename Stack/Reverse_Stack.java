import java.util.Stack;

public class Reverse_Stack {

                 public static void Push_At_Bottom(Stack<Integer> s1,int data){
                            
                              if (s1.isEmpty()) {
                                s1.push(data);
                                return;
                              }
                       int top=s1.pop();
                       Push_At_Bottom(s1, data);
                       s1.push(top);

                 }
                   
                                    public static void reverse(Stack<Integer>s1){
                                           
                                           if (s1.isEmpty()) {
                                            return;
                                           }
                                        int top=s1.pop();
                                        reverse(s1);
                                        Push_At_Bottom(s1,top); 
                                    }
    public static void main(String[] args) {

        Stack<Integer> s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        // Push_At_Bottom(s1 ,50);
        reverse(s1);
            while (!s1.isEmpty()) {
                System.out.println(s1.pop());
            }
    }
}
