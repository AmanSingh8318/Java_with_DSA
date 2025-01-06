 import java.util.Stack;
public class Stock_Price {

              public static void findSpan(int stocks[],int span[]){
                // create a stack
                 Stack<Integer>s1=new Stack<>();
                 span[0]=1;
                 s1.push(0);

                 // find the current price of the stocks
                   for (int i = 1; i < stocks.length; i++) {
                    int currPrice=stocks[i];
                       while (!s1.isEmpty() && currPrice>stocks[s1.peek()]) {
                        s1.pop();

                       }
                         if (s1.isEmpty()) {
                            span[i]=i+1;
                         }else {
                            int prevHigh=s1.peek();
                            span[i]=i-prevHigh;
                         }
                         s1.push(i);
                   }
              }
    public static void main(String[] args) {
         int stocks[]={100,80,60,70,60,85,100};
         int span[]=new int[stocks.length];
               
         findSpan(stocks, span);

         for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]);
         }
    }
}
