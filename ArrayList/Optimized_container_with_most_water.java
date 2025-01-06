  import java.util.ArrayList;

public class Optimized_container_with_most_water {
   // two  pointer approach  
      public static int Storewater(ArrayList<Integer>height){
        int Max_water=0;
      int left_pointer=0;
      int right_pointer=height.size()-1;
          while (left_pointer<right_pointer) {
              // calculate 
              
              int heights=Math.min(height.get(left_pointer),height.get(right_pointer));
              int width=right_pointer-left_pointer;
               int current_water=heights*width;
               Max_water=Math.max(Max_water, current_water);

                // update the pointers  
                if (height.get(left_pointer)<height.get(right_pointer)) {
                    left_pointer++;   
                }else {
                    right_pointer--;
                }
          }

           return Max_water;
      }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
           
        System.out.println(Storewater(height));
    }
}
