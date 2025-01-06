public class Friends_Pairing {

    public static int frd_Pair(int n){
        if (n==1||n==2) {
           return n; 
        }
        int totalWays=0;

        totalWays=frd_Pair(n-1)+(n-1)*frd_Pair(n-2);
        return totalWays;
    }
    public static void main(String[] args) {
        int n=3;

        System.out.println(frd_Pair(n));
    }
}
