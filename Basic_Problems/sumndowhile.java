
import java.util.Scanner;
public class sumndowhile {

public static void main(String[] args) {
    int sum=0,n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    n=sc.nextInt();
    do
    { 
        sum=sum+i;
        i++;

    }while(i<=n);

     System.out.println("The sum of Natural no is "+sum); 
}
    
}
