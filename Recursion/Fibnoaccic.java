public class Fibnoaccic {

     public static int fibooNo(int n ){
            if (n==0) {
                 return 0;
            }
            if (n==1) {
                return 1;
            }
            int fibn1=fibooNo(n-1);
            int fibn2=fibooNo(n-2);
            int fibN=fibn1+fibn2;
            return fibN;
     }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibooNo(n));
    }
}
