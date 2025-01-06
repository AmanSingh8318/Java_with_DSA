 import java.util.ArrayList;
public class maximunNum {
    public static void main(String[] args) {
           ArrayList<Integer> list=new ArrayList<>();
           list.add(1);
           list.add(2);
           list.add(20);
           list.add(4);
           list.add(5);
             int max=0;
           for (int i = 0; i <list.size()-1; i++) {
                //  if (max<list.get(i)) {
                //     max=list.get(i);
                //  }
                // do using math.max or manual check using if both ans are correct
             max=Math.max(max, list.get(i));
           }
            System.out.println(max);
    }
}
