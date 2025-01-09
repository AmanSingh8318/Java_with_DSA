public class Increment_by1 {

          public static int[] Increment_one(int arr[]){
              int n=arr.length;
            //   int temp[]=new int[n];
              for(int i=n-1;i>0;i--){
                 if (arr[i]<9) {
                    arr[i]++;
                    return arr;
                 }
                 arr[i]=0;
              }

               // handles a single case [9]

               int new_arr[]=new int[n+1];
               new_arr[1]=0;
               return new_arr;
          }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Increment_one(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

