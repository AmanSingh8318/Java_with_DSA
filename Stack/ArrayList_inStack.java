/**
 * ArrayList_inStack
 */
import java.util.ArrayList;
import java.util.Stack;
public class ArrayList_inStack {
  
        public static class stack{
              static ArrayList<Integer >  list=new ArrayList<>();

                public static void push(int data){
                    list.add(data);

                }
                public static int Pop(){
                    if(isEmpty()){
                        return -1;
                    }
                    int top=list.get(list.size()-1);
                     list.remove(list.size()-1); 
                   return top;
                }
                public static int peek(){
                    if (isEmpty()) {
                        return -1;
                    }
                    return list.get(list.size()-1);
                }

                 public static boolean isEmpty(){
                    return list.isEmpty();
                 }
        }
    public static void main(String[] args) {
        Stack s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
            while (!s1.isEmpty()) {
                System.out.println("Top "+s1.peek());
                s1.pop();
            }

    }
}