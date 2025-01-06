import java.util.Scanner;
public class powerofnumber {
    public static void main(String[] args) {
        int a,b,ans=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the Second  number");
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        {
            ans=ans*a;
        }
        System.out.println(ans);
    }
}
