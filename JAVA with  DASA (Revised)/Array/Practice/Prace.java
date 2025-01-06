// //  package Array.Practice;
 
// //  public class Prace {
   
// //                 public static void reverse(int arr[],int start,int end){
                      
// //                   while (start<=end) {
// //                      int temp=arr[start];
// //                      arr[start]=arr[end];
// //                      arr[end]=temp;

// //                      start++;
// //                      end--;
// //                   }
// //                 }
// //                                  public static void rotate(int arr[],int k){
                                    
// //                                        k=k%arr.length; // if k>arr.length

// //                                        int  n=arr.length;
                                  
// //                                          reverse(arr, n-k, n-1);
// //                                          reverse(arr, 0, n-k-1);
// //                                          reverse(arr, 0, n-1);
// //                                  }

// //               public static void print_Arr(int arr[]){
// //                 for (int i = 0; i < arr.length; i++) {
// //                   System.out.print(" " +arr[i]);
// //                 }
// //               }
// //    public static void main(String[] args) {
// //     int arr[]={1,2,3,4,5,6};
// //     int k=3;
// //      rotate(arr, k);
// //      print_Arr(arr);
// //    }
// //  }


// package Array.Practice;
// public class Prace {
//                 //  public static void calculate_Price(int prices[]){
//                 //    int max_price=0;
//                 //    int buy_price=Integer.MAX_VALUE;
//                 //   for (int i = 0; i < prices.length; i++) {
//                 //        buy_price=Math.min( buy_price,prices[i]);
//                 //        int total=prices[i]-buy_price;
//                 //        max_price=Math.max( total,max_price);
//                 //   }
//                 //   System.out.println(max_price);
//                 //  }\

//                     public static void calculare_profit(int prices[]){
//                       int max_price=0;
//                       int buy_price=Integer.MAX_VALUE;
//                       for (int i = 0; i < prices.length; i++) {
//                            if (buy_price<prices[i]) {
                           
//                              int profit=prices[i]-buy_price;
//                              max_price=Math.max(profit,max_price);
//                            }
//                            else {
//                            buy_price=prices[i];
//                            }

                          
//                       }
//                       System.out.println(max_price);
//                     }

//   public static void main(String[] args) {
    
//      int prices[]={7,1,5,3,6,4};
//      calculare_profit(prices);
//     //  calculate_Price(prices);
//   }
// }

// sunm of sub array 

// package Array.Practice;

// public class Prace {
                       
                  // public static void Add_sub_Arr(int arr[]){
                  //    int totl_price=0;
                  //   for (int i = 0; i < arr.length; i++) {
                  //      int curr_sum=0;
                  //      for (int j = 0; j < arr.length; j++) {
                  //        curr_sum+=arr[j];
                  //        total_profit=Math.max(buy_price,total_profit);
                  //      }
                  //   }
                  //      System.out.println(total_profit);
                  // }

//                          public static void Add_sub_Arr(int arr[]){
//                             //kadens algorithms
//                                 int curr_sum=0;
//                                 int total_sum=0;
//                             for (int i = 0; i < arr.length; i++) {
//                                curr_sum+=arr[i];
//                                 total_sum=Math.max(curr_sum, total_sum);

//                                 if (curr_sum<0) {
//                                   total_sum=curr_sum;
//                                 }
//                             }
//                             System.out.println(total_sum);
//                          }

//    public static void main(String[] args) {
//       int arr[]={1,2,3,4};
//       Add_sub_Arr(arr);

//    }
// }


    package Array.Practice;
    
    public class Prace {
    
      public static void main(String[] args) {
        int arr[]={};
      }
    }