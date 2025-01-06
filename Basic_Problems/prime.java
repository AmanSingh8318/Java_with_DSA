import java.util.Scanner;

public class prime {
    public static int isprime(int n)
    {
    for (int i = 2; i<=Math.sqrt(n); i++) {
        if(n%i==0)
        {
            System.out.println("no is not prime");
        }
        else
        {
            System.out.println("No is prime");
        }
         break;        
    }
return n;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not ");
        int n=sc.nextInt();

        isprime(n);
     }
    
}
