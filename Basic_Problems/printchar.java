import java.util.Scanner;
public class printchar {
    public static void main(String[] args) {
     char ch='A';
        int n;
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of character ");
      n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<i;j++)
        {
            System.out.print(ch);
            ch++;
            
        }
        System.out.println();
       }
        
    }
    
}
