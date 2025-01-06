  import java.util.Deque;
import java.util.LinkedList;
public class Queue_using_Dequee {

        public static class  My_Queue{
                 Deque<Integer> d1=new LinkedList<>();

                  public void Add(int data){
                    d1.addFirst(data);
                  }

                   public int Remove(){
                    return d1.removeFirst();
                   }

                   public int peek(){
                    return d1.getFirst();
                   }
        }
    public static void main(String[] args) {
          My_Queue m1=new My_Queue();
          m1.Add(10);
          m1.Add(20);
          m1.Add(30);
            while (!m1.d1.isEmpty()) {
                System.out.print(m1.Remove()+" ");
            }
    }
}
