public class Second_LargestArr {

     public static void main(String[] args) {
        int arr[]={1,2,3,9,5};
            
        int Largest=Integer.MIN_VALUE;
        int second_Largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]>Largest) {
                second_Largest=Largest;
                Largest=arr[i];
             } else if(arr[i]>second_Largest && arr[i]!=Largest){
                second_Largest=arr[i];
             }
             
        }
        System.out.println( second_Largest);
     }
}