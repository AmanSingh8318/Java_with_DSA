import java.util.Scanner;
public class floydstrang {
     public static void py3()

     {
        int count=1,n;
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number ");
        n=sc.nextInt();
   
        for(int i=1;i<n;i++)
        {
        for(int j=1;j<=i;j++)
        {
            System.out.print("  "+count);
            count ++;
        } 
        System.out.println(); 
     }
    
    }
     public static void main(String[] args) {
        py3();
     }
}
