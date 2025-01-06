/**
 * find_all_occurance
 */
public class find_all_occurance {
      public static int cal_occurance(int arr[],int key,int i)
      {
        if (i==arr.length-1) {
            return -1;
        }
        
         if(arr[i]!=key) {

        continue;
        return i;
         }
        return cal_occurance(arr, key, i+1);
      }
    public static void main(String[] args) {

        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
      int mainres=  cal_occurance(arr, 2, 0);

      System.out.println(mainres);
    }
}