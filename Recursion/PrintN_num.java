/**
 * PrintN_num
 */
public class PrintN_num {
       public static void printnum_rev(int n ){
          if (n==1) {
             System.out.print(1);
             return ;
          }
          System.out.println(n);
          printnum_rev(n-1);
       }
    public static void main(String[] args) {
        int n=10;
        printnum_rev(n);
    }
    
}