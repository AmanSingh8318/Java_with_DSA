    public class Reverse_Arr {


            public static int[] Reverse(int arr[]){
                int temp[]=new int[arr.length];
                int j=0;
                 for (int i = 0; i < arr.length; i++) {
                    temp[j++]=arr[i];
                 }
                 return temp;
                 }
            

                         public static int[] Rotate(int arr[],int k){
                            Reverse(arr);
                            int n=arr.length;
                            int temp[]=new int[n];
                            int j=0;
                            for (int i = n-k; i < temp.length; i++) {
                                temp[j++]=arr[i];
                            }
                            for(int i=0;i<n-k;i++){
                                temp[j++]=arr[i];
                            }
                            return temp;

                        }
                         
                                     public static void Print_Arr(int arr[]){
                                        for (int i = 0; i < arr.length; i++) {
                                            System.out.print(" "+arr[i]);
                                        }
                                     }
    
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
            int k=3;
            
            k=k%arr.length;
            arr=Rotate(arr, k);
          Print_Arr(arr);

            // Reverse(arr);
        }
    }