public class Find_Duplicate {

  public static void main(String[] args) {
    int arr[]={1,1,2};
    int j=0;
    int count=0;

     for (int i = 0; i < arr.length; i++) {
      if (arr[j]!=arr[i]) {
        j++;
        arr[j]=arr[i];
      }
     }
     System.out.println(j+1);
     System.out.println(count);
  }
      
}