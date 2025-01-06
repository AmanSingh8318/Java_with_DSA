import java.util.Scanner;
public class hollowrecntanle {

     public static void rect(int row,int cols)
     {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(i==1|| i==row || j==1 || j==cols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
     public static void main(String[] args) {
        int row,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbere of rows");
        row=sc.nextInt();
        System.out.println("Enter the number of coloums ");
        cols=sc.nextInt();

        rect(row, cols);
     }
}
