public class Factorial_String {


    public static void CalString(String str,String ans){
        // base case 
            if (str.length()==0) {
                System.out.println(ans);
                return;
            }
        // loop i to str.length to find the currecnt character 
        for (int i = 0; i < str.length(); i++) {
          char c=str.charAt(i);
          // now delte to the current character like this if abcde is string and choose c is 
          // currecnt char "ab"+"de"
          String newStr=str.substring(0, i)+str.substring(i+1);
          // call recursive function and pass NewString as newStr 
          CalString(newStr, ans+c);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        CalString(str, " ");
    }
}
