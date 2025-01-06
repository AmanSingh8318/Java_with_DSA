package Array;

public class Buy_sell_stoxk {

                     public static void Profit_of_Stock(int arr[]){
                        int buy_price=Integer.MAX_VALUE;
                        // int selling_price=0;
                        //arr[i]  selling prices 
                         int profit=0;
                        for (int i = 0; i < arr.length; i++) {
                         buy_price=Math.min( buy_price,arr[i]);
                         int current_profit=arr[i]-buy_price;
                         profit=Math.max(profit,current_profit);
                        }
                        System.out.println(profit);

                     }
  public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4};
    Profit_of_Stock(arr);
  }    
}
