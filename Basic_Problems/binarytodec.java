import java.util.Scanner;
public class binarytodec {
    public static void bindec(int n)
    {
        int pow=0;
        int dec=0;
        while (n>0) {
            int lastdigit=n%10;
            dec= dec +(lastdigit *(int)Math.pow(2, pow));
            pow++;
             n=n/10;
            
        }
        System.out.println("Decimal no is "+dec);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number ");
        n=sc.nextInt();

        bindec(n);
    }
    
}
