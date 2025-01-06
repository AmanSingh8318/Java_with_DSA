import java.util.Scanner;
public class addsum {
    public static int sum()
    {
        int sum,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
    sum=a+b;
        System.out.println( "The sum of two number is:"+sum);
        return sum;
    }
    public static void main(String[] args) {
        int sum;
        sum();
    }
    
}
