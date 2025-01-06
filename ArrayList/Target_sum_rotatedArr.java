   import java.util.ArrayList;
public class Target_sum_rotatedArr {
      
         public static boolean Target_sum(ArrayList<Integer>list){
               int target=16;
               int n=list.size();
                      int breaking_point=-1;
                      for (int i = 0; i <list.size(); i++) {
                        if (list.get(i)>list.get(i+1)) {
                            breaking_point=i;
                            break;
                        }
                      }
                int right_pointer=breaking_point;
                int left_pointer=breaking_point+1;

                while (left_pointer!=right_pointer) {
                      if (list.get(left_pointer)+list.get(right_pointer)==target) {
                        return true;
                      }
                      else if(list.get(left_pointer)+list.get(right_pointer)<target){
                        left_pointer=(left_pointer+1)%n;
                      }else {
                        right_pointer=(n+right_pointer-1)%n;
                      }
                }

                      return false;
                  }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(Target_sum(list));
    }
}
