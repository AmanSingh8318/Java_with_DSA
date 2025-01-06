public class PairSum {

    public static void SumofPair(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==key){
                    System.out.println("Pair found with sum "+key +" are "+arr[i] +" and "+arr[j]);
                }
            }  
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
SumofPair(arr, 9);
    }
}
