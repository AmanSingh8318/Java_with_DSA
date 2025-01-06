public class Find_next_Greater {
       

                public static int[] find_next(int arr[]){

                      int n=arr.length;
                      int temp[]=new int[n];
                    for (int i = 0; i <arr.length; i++) {
                        for (int j = i+1; j <arr.length; j++) {
                            if (arr[i]<arr[j]) {
                                temp[i]=arr[j];
                                break;
                            }
                            else {
                                temp[i]=-1;
                            }
                        }
                          
                    }
                        return temp;
                }
     public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
    int result[]=find_next(arr);
       for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+" ");
       }
    
     }
}
