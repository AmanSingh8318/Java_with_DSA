import java.util.Scanner;

public class invertedorder {
     public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number according to user ");
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
