public class find_firarOccur {


    public static int find_first_occur(int arr[],int i,int key ){
        if (i==arr.length) {
             return -1;
        }
            if (arr[i]==key) {
                 return i;
            }
            return  find_first_occur(arr, i+1,key);
    }


              public static int lastOccurence(int arr[],int key,int i){

                   if (i==arr.length) {
                    return -1;
                   }
                   int isFound=lastOccurence(arr, key, i+1);
                   if (isFound !=-1) {
                       return isFound;
                   }
                   if (arr[i]==key) {
                    return i;
                   }
                   return i;
              }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,5,8};
        int i=0;
       int  key=5;
      int res= find_first_occur(arr, i, key);
System.out.println("The key that is find from first occurance is    "+res);
              System.out.println("The key that is find from Last occurance is   "+lastOccurence(arr, key, i));
    }
}
