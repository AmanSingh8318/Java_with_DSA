public class ReapetarrReturn {

    public static int Reapetreturns(int arr[]){
        int res=0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i+1; j < arr.length; j++) {
                        if (arr[i]==arr[j]) {
                       res= arr[i];
                        }
                    }
                }
                return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        System.out.println("The repeated number is: "+Reapetreturns(arr));
    }
}