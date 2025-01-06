public class NumIcreasing_order {

      public static void Increaseno(int n ){
             if (n==10) {     // base case 
                  System.out.println(10);
                  return; 
             }
             System.out.println(n);
            Increaseno(n+1);  //  function call itself  
      }

         public static void Increase(int n ){
               if (n==1) {
                   System.out.println( 1);
                   return ;
               }
               Increase(n-1);

               System.out.println(n);
         }
      public static void main(String[] args) {
        int n=5;
        // Increaseno(n);
        Increase(n);
      }
}
