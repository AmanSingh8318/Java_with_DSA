 import java.util.LinkedList;
import java.util.Queue;
public  class Inter_Leave_Queue {
                    
                    public static void InterLeave_Queue(Queue<Integer>q1){
                            // create a empty key to store the half of queue
                        Queue<Integer> half_First=new LinkedList<>();
                        int size=q1.size();

                        for (int i = 0; i <size/2; i++) {
                           half_First.add(q1.remove());   
                        }

                         while (!half_First.isEmpty()) {
                           q1.add(half_First.remove());
                            q1.add(q1.remove());
                         }

                    }

      public static void main(String[] args) {
            Queue<Integer> q1=new LinkedList<>();
                q1.add(1);
                q1.add(2);
                q1.add(3);
                q1.add(4);
                q1.add(5);
                q1.add(6);
                q1.add(7);
                q1.add(8);
                q1.add(9);
                q1.add(10);
                InterLeave_Queue(q1);
                // print satatement
                  while (!q1.isEmpty()) {
                    System.out.print(q1.remove()+ "  ");
                  }
      }
}
