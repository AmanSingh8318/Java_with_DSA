 import java.util.Scanner;
public class numevensub {
     public static void main(String[] args) {
        int i,n,ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2==0)
            {
             ans-=i;
            }
            else
            {
                ans+=i;
            }
        }
        System.out.println(ans);
     }
}
