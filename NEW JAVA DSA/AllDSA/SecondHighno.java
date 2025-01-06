public class SecondHighno{
    public static void main(String[] args){
  int arr[]={1,2,3,4,5};
         

  int max=arr[0];
  int min=0;
   for(int i=0;i<arr.length;i++){
       if (arr[i]>max) {
          max=arr[i];

       }

   }
   System.out.println("Max no is "+max);


       for(int i=0;i<arr.length;i++){
        if(arr[i]>min && arr[i]!=max){
             min=arr[i];
        }
       }

       System.out.println(" second highest value is "+min);
    }
}