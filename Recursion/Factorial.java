public class Factorial {

       public static int FactNum(int n){
        //  base case
        if (n==1 || n==0) { 

             return 1;
        }  

        return n*FactNum(n-1);  // function calling itself
       }
    public static void main(String[] args) {
        int n=4;
                 System.out.println(FactNum(n));        
    }
}
