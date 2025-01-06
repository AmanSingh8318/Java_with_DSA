public class Bit_evenor_odd {

    public static void checkEvenorOdd(int n){
        int maskbit=1;
        if ((n&maskbit)==0) {
            // even 
            System.out.println("no is even"+n);
        }else {
            System.out.println("no is odd "+n);
        }
    }
    public static void main(String[] args) {
        checkEvenorOdd(11);
        checkEvenorOdd(5);
        checkEvenorOdd(12);
    }
}
