import java.util.Scanner;

public class pallindrome {
    
    public static void pallin(int n)
    {
        int sum=0;
        int i;
      int   temp=n;
        while(n>0)
        {
           int  r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("The no is pallindrome");
        }
        else{
            System.out.println("No is not pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the no is pallindrome or not ");
        int n=sc.nextInt();
        pallin(n);
    }
}
