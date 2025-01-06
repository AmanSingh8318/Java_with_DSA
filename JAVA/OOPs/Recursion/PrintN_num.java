package OOPs.Recursion;

/**
 * PrintN_num
 */
public class PrintN_num {

    public static void printreverse(int n ){
        if (n==1) {
            System.out.println(1);
            return ;
        }
        printreverse(n-1);
    }
public static void main(String[] args) {
    int n=10;
    printreverse(n);
}
    
    
}