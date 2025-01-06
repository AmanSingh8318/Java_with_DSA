
public class Dublicate_str_arr {

                        public static boolean is_Valid(String str){
                               for (int i = 0; i <str.length(); i++) {
                                   char ch=str.charAt(i);
                                     if ((ch=='{' && ch=='}') || 
                                       (ch=='(' && ch==')')  || 
                                        (ch=='[' && ch==']')) {
                                          
                                            return true;
                                     }
                                     
                               }

                               return false;
                        }
    public static void main(String[] args) {
       String str="{{}}"; 

       System.out.println(is_Valid(str));

    }
}
