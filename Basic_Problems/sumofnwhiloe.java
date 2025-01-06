 import java.util.Scanner;
public class sumofnwhiloe{
    public static void main(String[] args) {
        int sum=0,i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of natural no is"+sum);
    }
}
