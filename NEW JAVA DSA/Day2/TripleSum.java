package Day2;

public class TripleSum {
    public static void SumTrip(int arr[]){
        int target=12;
      int ans=0;

  for (int i = 0; i < arr.length; i++) {
        int sum1=arr[i];
        for (int j = i+1; j < arr.length; j++) {
          int sum2=arr[j];
          for (int k = j+1; k < arr.length; k++) {
              int sum3=arr[k];
              if (sum1+sum2+sum3==target) {
                ans++;
                System.out.println("Triplet sum is "+sum1+  "and "+sum2+ "and"+sum3+" =:12");
              }
          }
        }
  }
  System.out.println(ans);
}
public static void main(String[] args) {
  int arr[]={1,2,3,4,5,6};
  SumTrip(arr);
}
}
