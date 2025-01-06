public class Cal_power {


    public static int cal_power(int x,int n){
           if (n==0) {
             return 1;
           }
           return  x*cal_power (x, n-1) ;
    }
    public static void main(String[] args) {
        int res= cal_power(2, 5);

        System.out.println(res);

    }
}
