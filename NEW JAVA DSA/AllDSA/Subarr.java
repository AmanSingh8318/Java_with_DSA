public class Subarr {

    public static void SubarrofN(int arr[]){
        int totalpair=0;
        int sum=0;
    for (int i = 0; i < arr.length; i++) {
        int start=i;//2,4,6,8,10
        for (int j = i; j < arr.length; j++) {
            int end=j;
            for (int k = start; k<=end; k++) {
                System.out.print(arr[k]+"the sum is "+arr[i]+arr[j]);
                totalpair++;

            }
            System.out.println();
        }
System.out.println();
    }
    System.out.println("total pair of sub array is "+totalpair);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SubarrofN(arr);
    }
}
