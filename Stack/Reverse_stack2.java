import java.util.Stack;

public class Reverse_stack2 { 
                            
                             public static void reverse(Stack<Integer>s1,Stack<Integer>s2){

                                //  Stack<Integer>s2=new Stack<>();
                                    if (s1.isEmpty()) {
                                        return;
                                    }
                                    int top=s1.pop();
                                    reverse(s1,s2);
                                    s2.push(top);




                                   
                             }
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        s1.push(10);
        s1.push(20);
        reverse(s1,s2);

            while (!s2.isEmpty()) {
                System.out.println(s2.pop());
            }
    }
}
