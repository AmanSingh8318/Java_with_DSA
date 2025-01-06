 import java.util.LinkedList;
public class LL_Framework {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);
        l1.addLast(40);
        l1.addLast(50);
        System.out.println(l1);

         l1.removeFirst();
         l1.removeLast();
         System.out.println(l1);
    }
}
