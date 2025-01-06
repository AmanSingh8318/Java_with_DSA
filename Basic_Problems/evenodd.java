import java.util.*;
public class evenodd {

     
     public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the to check no is even or odd");
         a=sc.nextInt();
         if(a%2==0)
         {
            System.out.println("The no is even");
         }
         else{
            System.out.println("the no is odd ");
         }
     }
}
