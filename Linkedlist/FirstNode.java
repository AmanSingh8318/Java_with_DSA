/**
 * FirstNode
 */
public class FirstNode {
    
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
                     
            public static Node Head;

        }
            public void print(int data){
                System.out.println(data);
            }
    public static void main(String[] args) {
        FirstNode f1=new FirstNode();
          f1.print(10);
    }
}