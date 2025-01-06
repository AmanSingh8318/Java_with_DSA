package Array;

public class Buy_sell_Stock_II {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int total_profit=0;
         
          for (int i = 0; i < arr.length-1; i++) {
            int buy_price=arr[i];
            int selling_price=arr[i+1];
            if (buy_price<selling_price) {
                total_profit+=selling_price-buy_price;
            
            }else {
                selling_price=arr[i+1];
            }
          }
          System.out.println(total_profit);
    }
}
