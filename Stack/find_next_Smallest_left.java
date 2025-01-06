  import java.util.Stack;
public class find_next_Smallest_left {
               
                 public static int[] find_next_sm_Left(int arr[]){
                    int n=arr.length;
                    int next_smallest[]=new int[n];

                    Stack<Integer>s1=new Stack<>();
                    for (int i = 0; i < arr.length; i++) {
                          while (!s1.isEmpty() && arr[s1.peek()]>arr[i]) {
                            s1.pop();
                          }

                          if (s1.isEmpty()) {
                            next_smallest[i]=-1;
                          }else{
                            next_smallest[i]=arr[s1.peek()];
                          }

                          s1.push(i);
                    
                    }
                    return next_smallest;
                 }
                                          public static int[] find_next_sm_right(int arr[]){
                                            int n=arr.length;
                                            int next_smallest[]=new int[n];
                                            Stack<Integer>s1=new Stack<>();
                                            for (int i = arr.length-1; i>=0; i--) {
                                                
                                                while (!s1.isEmpty() && arr[s1.peek()]>arr[i]) {
                                                    s1.pop();
                                                }
                                                if (s1.isEmpty()) {
                                                    next_smallest[i]=-1;
                                                }else{
                                                    next_smallest[i]=arr[s1.peek()];
                                                }
                                                s1.push(i);
                                            }
                                            return next_smallest;
                                          }
    public static void main(String[] args) {
        
           int arr[]={5,0,6,2};
         int res[]=  find_next_sm_Left(arr);
         int res1[]=find_next_sm_right(arr);
           
         // smallest of the left side 
         for (int i = 0; i < res.length; i++) {
          System.out.print(res[i]+"  ");
         }
             System.out.println();

         // smallest of the right side
         for (int i = 0; i < res1.length; i++) {
            System.out.print(""+res1[i]+"  ");
         }
    }
}
