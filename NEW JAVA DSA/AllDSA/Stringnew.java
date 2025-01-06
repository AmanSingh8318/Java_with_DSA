  import java.util.Scanner;
public  class Stringnew{

    // declaration and taking input

    public static void LearnString(){
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the name");
    // String name=sc.next();// store the single word


    System.out.println("Enter the Full Name");
    String full_name=sc.nextLine(); // store the full line


    // System.out.println("Name is"+name);
    System.out.println("Full Name is"+full_name);
    sc.close();
    }


    
    public static void main (String args[]){
        char arr[]={'a','b','c','d'};  //char declaration

        String str="Aman singh "; // String declaration
        String str2=new String("Aman singh");  // String declaration using new keyword

        System.out.println(arr);
        
        LearnString();
    }
}