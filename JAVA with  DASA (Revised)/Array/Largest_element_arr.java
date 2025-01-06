package Array;

public class Largest_element_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int min=arr[0];
        int  max=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=min) {
               min=arr[i]; 
            }  else {
                max=arr[i];
            }
        }

         System.out.println("The largest element in the array :  "+max);
         System.out.println("The smallest element in the array : "+min);

    }
}
