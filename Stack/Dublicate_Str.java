/**
 * Dublicate_Str
 */
import java.util.Stack;


public class Dublicate_Str {

            public static boolean check_INvalid(String str){
              Stack<Character> s1 = new Stack<Character>();

              for (int index = 0; index <str.length(); index++) {
                  char ch=str.charAt(index);

                   //  check for opening bracket 
                     if (ch=='[' || ch=='{' || ch=='(') {
                      
                      s1.push(ch);
                     }
                     else {
                           
                         // check empty in loop 

                          // if (s1.isEmpty()) {
                          //   return false;
                          // }
                         // for  closing bracket 
                         if ((s1.peek()== '[' && ch==']')  || 
                            (s1.peek()=='{' && ch=='}') || 
                             (s1.peek()=='(' && ch==')')) {
                             
                              s1.pop();
                         }
                         else {
                          return false ;
                         }
                     }
              }
                    if (s1.isEmpty()) {
                      return true;
                    }

                   else 
                    return false;
            }
        

   
  public static void main(String[] args) {
      String str="({[](})";
  System.out.println(check_INvalid(str));


  }
}