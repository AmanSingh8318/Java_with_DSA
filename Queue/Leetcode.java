public class Leetcode {

       public static int find(int arr[],int i){
        int count=0;
        int n=arr.length;
        // int i=0;
             if (arr.length==0) {
                return -1;
             }
             if (arr[i]==arr[i+1]) {
                count=arr[i];
                return count;
             }
            return find(arr,i+1);
       }
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2};
 
       int res=  find(arr,0);
  System.out.println(res);

    }
}
