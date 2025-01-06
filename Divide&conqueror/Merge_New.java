public class Merge_New {


    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
      public static void Mergearr(int arr[],int start,int end){
           if (start>=end) {
            return;
           }
           int mid=(start+end)/2;

           Mergearr(arr, start, mid);
           Mergearr(arr, mid+1, end);
           sortArr(arr, start, mid, end);
      }

      // comapre and merge
      public static void sortArr(int arr[],int start,int mid,int end){

        int i=start;
        int j=mid+1;
        int k=0;
        // make a temp array 
        int temp[]=new int [end-start+1];
        while (i<=mid && j<=end) {
             if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
             }
             else {
                temp[k]=arr[j];
                j++;
             }
             k++;
        }

            // for left remaining parts
            while (i<=mid) {
                temp[k++]=arr[i++];
            }
            while (j<=end) {
                temp[k++]=arr[j++];
             
            }

            // copy from temp to original array 
            for (k =0 , i=start;k < temp.length; k++,i++) {
                arr[i]=temp[k];
            }
      }
    public static void main(String[] args) {
        int arr[]={1,2,7,4,5};
        Mergearr(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
