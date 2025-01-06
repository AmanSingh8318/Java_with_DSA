/**
 * Diagonalsum
 */
import java.util.Scanner;
public class Diagonalsum {

    public static int SumofDiag(int arr[][]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
        }
        return sum;
    }
public static void main(String[] args) {
Scanner sc=new  Scanner(System.in);
System.out.println("enter the no fo rows");
int m=sc.nextInt();
System.out.println("enter the no of columns");
int n=sc.nextInt();
System.out.println("Enter the array element");
int[][] arr=new int[m][n];
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) {
        arr[i][j]=sc.nextInt();
    }
}
System.out.println("Sum of diagonal elements is "+SumofDiag(arr));
sc.close();
}
    
}