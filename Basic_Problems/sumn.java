import java.util.Scanner;
public class sumn {
     public static void main(String[] args) {
        
     
    int n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     n=sc.nextInt();
     for(i=0;i<=n;i++)
     
        sum=sum+i;
     
     System.out.println(sum);
     }  
}
