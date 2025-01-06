  import java.util.Stack;
public class find_next_gr_Left {
     
      public static int[] Greater(int arr[]){
          int n=arr.length;
          Stack<Integer> s1=new Stack<>();
             int next_greater[]=new int[n];

             for (int i = 0; i <arr.length; i++) {
                  
                while (!s1.isEmpty() && arr[s1.peek()]<=arr[i]) {
                     s1.pop();
                }
                if (s1.isEmpty()) {
                 next_greater[i]=-1;   
                }else{
                    next_greater[i]=arr[s1.peek()];
                }
                s1.push(i);
             }
             return next_greater;

      }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
       int res[]= Greater(arr);
    for (int i = 0; i < res.length; i++) {
        System.out.println(res[i]);
   
    }
    }
}
