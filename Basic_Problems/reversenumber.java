import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        int n,ans=0,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        while(n>0)
        {
         ans=ans*10;
         ans+=n%10;
         n=n/10;  
        }
        System.out.println("Reverse of given number is "+ans);
    }
    
}
