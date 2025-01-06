 import java.util.Stack;
public class Leetcode {

                    public static int cal_ways(int n){
                            
                        Stack<Integer> s1=new Stack<>();
                           

                          
                        int res= cal_ways(n-1) +cal_ways(n-2);

                        // System.out.println( res);
                        return res;
                    }
    public static void main(String[] args) {
        int n=3;
      int res1=  cal_ways(n);
      System.out.println(res1);

    }
}
