import java.util.Scanner;
public class Arrcreation {

    public static void Maxval(int arr[][]){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j]>max) {
                                      max=arr[i][j];
                }
        }
    }
    System.out.println("the max value is "+max);

    }
    
    public static void Minval(int arr[][]){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j]<min) {
                                      min=arr[i][j];


                }

        }

    }
    System.out.println("the min value is "+min);

    }
    public static void PrintVal(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
    
                System.out.print(arr[i][j]);
            }
            System.out.println();
            
        }

    }
     public static void Search(int arr[][] ,int key){
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
             if (arr[i][j]==key) {
                 System.out.println("found the key postion row of "+i+ "and  row of "+ j+" & value "+"the value is "+key);
             }
        }
       }

    
     }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter the size of m");
    int m=sc.nextInt();
    System.out.println("enter the size of n");
    int n=sc.nextInt();
     int arr[][]=new int [m][n];
    System.out.println("enter the array element");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          arr[i][j]=sc.nextInt();
        }
    }
    //  call the search funtion
    Search(arr, 5);
    // call the print function
    PrintVal(arr);
    //call the max function
    Maxval(arr);
   //call the min function 
   Minval(arr);
   }    
}

