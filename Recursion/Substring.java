public class Substring {


    public static void stringchck(String str,int i,String curr){

        if (i>=str.length()) {  // base case 
            return ;
        }
        System.out.println(curr+str.charAt(i));

        stringchck(str, i+1,curr+str.charAt(i));// function call itself
        stringchck(str, i+1,curr);// function call itself

    }
    public static void main(String[] args) {
        String str = "aba";
        stringchck(str, 0,"");
    }
}
