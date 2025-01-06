import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int i,fact=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr to find the facotrial");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        
        System.out.println("The factorial of given no is "+i+" : "+fact);
    }
}
    
}
