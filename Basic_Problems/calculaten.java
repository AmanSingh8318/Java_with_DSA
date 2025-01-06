 import java.util.Scanner;
public class calculaten {
    public static void main(String[] args) {
        
        int n,cout=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        while (n>0)
         {
           n=n/10;
           cout ++;  
        }
        System.out.println(cout);
    }
    
}
