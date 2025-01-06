
package Array;

public class Buy_sell_Stock_2nd_Method {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
          
        int buy_price=Integer.MAX_VALUE;
        int total_profit=0;
        for (int i = 0; i < arr.length; i++) {
            if (buy_price<arr[i]) {
                int profit=arr[i]-buy_price;
                total_profit=Math.max(profit,total_profit);
            }else {
                buy_price=arr[i];
            }
        }
        System.out.println("total proft is "+total_profit);
    }
}
