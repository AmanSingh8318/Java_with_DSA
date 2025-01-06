   import java.util.Stack;
public class find_next_Greater2 {
            
          
        
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int n=arr.length;
        int next_greater[]=new int[n];
        Stack<Integer>s1=new Stack<>();
          for (int i = arr.length-1;i>=0; i--) {
              
              while (!s1.isEmpty() && arr[s1.peek()]<=arr[i]) {
                    s1.pop();
              }

              if (s1.isEmpty()) {
                  next_greater[i]=-1;
              }
              else {
                  next_greater[i]=arr[s1.peek()];
              }
              s1.push(i);
          }
               
          for (int i = 0; i < next_greater.length; i++) {
            System.out.print(next_greater[i]+" ");
          }
    }
}
