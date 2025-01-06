import java.util.Scanner;
public class armstrong {
    
    public static void arm(int n )
    {
        int sum=0;
        int r=0;
        int temp=n;
        while (n>0) {
            
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("The given no is armstrong");

        }
        else
        {
            System.out.println("The given no is not armstrong ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check the no is armstrong or not ");
        n=sc.nextInt();
        arm(n);
    }
}
