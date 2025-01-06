
   import java.util.ArrayList;
public class Two_pointer_AP_Target {
       
         public  static boolean Target_sum(ArrayList<Integer>list){
              int left_pointer=0;
              int right_pointer=list.size()-1;
              int target=5;
              while (left_pointer<right_pointer) {
                if (list.get(left_pointer)+list.get(right_pointer)==target) {
                      
                    return true;
                } else if(list.get(left_pointer)+list.get(right_pointer)<target){
                    left_pointer++;
                }else {
                    right_pointer--;
                }
              }
              return false;
         }
     public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
System.out.println(Target_sum(list));
     }
}
