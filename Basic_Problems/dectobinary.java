import java.util.Scanner;
public class dectobinary {
    public static void decbinary(int n)
    {
      int i;
      int pow=0;
      int bin=0;
      int rem=0;
      while (n>0) {
        
      
      rem=n%2;
      bin= bin + (rem *(int) Math.pow(10, pow));

      pow++;
      n=n/2;
      }
      System.out.println("the binary no of given no is "+bin);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the deciml no to convert the binary");
        n=sc.nextInt();
        decbinary(n);
    }
    
}
