public class pyramid1 {
    public static void py1()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j>=(i-5);j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    public static void main(String[] args) {
        py1();
    }
    
}
