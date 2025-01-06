/**
 * Dublicate_Paranethesis
 */
import java.util.Stack;
public class Dublicate_Paranethesis {

                                public static  boolean is_Valid(String str){

                                    Stack<Character> c1=new Stack<>();
                                    
                                    for (int i = 0; i <str.length(); i++) {
                                        char ch=str.charAt(i);

                                        // closing braces
                                         if (ch==')') {
                                            int count=0;
                                                                while (c1.peek()!='(') {
                                                                    c1.pop();
                                                                    count++;
                                                                }
                                                                if (count<1) {
                                                                    return true;  // dublicate
                                                                } else {
                                                                    c1.pop();  // find pairs
                                                                      
                                                                }

                                                            }
                                          // opening braces
                                         else {
                                            c1.push(ch);
                                         }
                                    }
                                    return false;
                                }
    public static void main(String[] args) {
         String str="(((a+b))+c)";
         System.out.println(is_Valid(str));
    }
}