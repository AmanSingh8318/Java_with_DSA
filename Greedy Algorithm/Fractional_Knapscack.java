/**
 * Fractional_Knapscack
 */
import java.util.Arrays;
import java.util.Comparator;
public class Fractional_Knapscack {

    public static void main(String[] args) {
        int weight[]={10,20,30};
        int values[]={60,100,120};
        int W=50;

          // create a 2D array to find the ratio
        
           double ratio[][]=new double[weight.length][2];
           for (int i = 0; i <weight.length; i++) {
            ratio[i][0]=i;   // store index 
            ratio[i][1]=((double)values[i]/weight[i]);  // store ratio
           }
           // Sort (Asscending order) the ratio  using lambda function 
           Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
           // Now Sort the array in desending order 
            int capacity=W;
            int totalVal=0;
                for(int i=ratio.length-1; i>=0;i--){
                    // find the indx 
                    // store the full values
                    int indx= (int)ratio[i][0];
                     if (capacity>=weight[indx]) {
                        totalVal+=values[indx];
                        capacity-=weight[indx];
                     }else {
                        // store the fractional values
                     totalVal+=(ratio[i][1]* capacity);
                     capacity=0;
                     break;
                     }
                }
                System.out.println("The maximum value is "+totalVal);
    }
}