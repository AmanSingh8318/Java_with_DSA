public class fact {


    public static int resur(int n){
        if (n==0 ||n==1) {
             return 1;
        }
        return resur(n-1)*n;
    }
   public static void main(String[] args) {
     int n=5;

     System.out.println(resur(n));
   } 

}
