public class Cal_pow_Optimized {

    public static int cal_optimized_power(int x,int n ){
        if (n==0) {
             return 1;
        }
        // int halfOptimized_sqr=cal_optimized_power(x, n/2)* cal_optimized_power(x, n/2);
        // insted of this using more optimized approach
        //  store in halfres by doing this   the same function not call twice at the time
        int halfRes=cal_optimized_power(x, n/2);
        int halfOptimized_sqr=halfRes*halfRes;

        if (n%2!=0){
            halfOptimized_sqr=x*halfOptimized_sqr;
        }
             return halfOptimized_sqr;
        }
    
    public static void main(String[] args) {
        int x=2;
        int n=5;

        System.out.println(cal_optimized_power(x, n));
    }
}
