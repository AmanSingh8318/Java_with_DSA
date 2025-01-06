        import java.util.Stack;
public class Reverse_String {


        public static String reverse(String str){

                Stack<Character> s=new Stack<>();

            int i=0;
             while (i<str.length()) {
                  s.push(str.charAt(i));
                  i++;
             }  
              
               StringBuilder sb=new StringBuilder("");
                while (!s.isEmpty()) {
                    
                    char curr=s.pop();
                      sb.append(curr);
                }
                return sb.toString();
        }
    public static void main(String[] args) {
         String str="abx";

         String res=reverse(str);
         System.out.println(res);
    }
}
