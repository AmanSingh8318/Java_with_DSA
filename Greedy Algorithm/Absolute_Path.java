import java.util.Arrays;
public class Absolute_Path {
    
    public static void main(String[] args) {
       
        
        // int A[]={1,2,3};
        // int B[]={2,1,3};


             int A[]={4,1,8,7};
             int B[]={2,3,6,5};
        // Step:-1 sort the both arrays 
        Arrays.sort(A);
        Arrays.sort(B);

        int AbsPath=0;
         for (int i = 0; i < A.length; i++) {
            AbsPath+=Math.abs(A[i]-B[i]);
         }

         System.out.println("The Absolute path is "+AbsPath);
    }
}
