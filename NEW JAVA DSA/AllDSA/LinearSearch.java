public class LinearSearch {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int SearchVal=5;

        for(int i=0;i<arr.length;i++){
            if (arr[i]==SearchVal) {
                 System.out.println("The Seach value is "  +SearchVal+  " And the indexing is "+i);
            }
        }
     }
}
  