/**
 * Length_of_str
 */
public class Length_of_str {


    public static int Stringcheck(String str){
        if (str.length()==0) {
            return 0;
        }
     return    Stringcheck(str.substring(1))+1;
    }

     public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println(Stringcheck(str));
     }
}