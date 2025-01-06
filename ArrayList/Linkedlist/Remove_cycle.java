public class Remove_cycle {

                                public static class Node {
                                    int data;
                                    Node next;
                                    public Node(int data){
                                        this.data = data;
                                        this.next = null;
                                    }
                                }
                                 public static Node head;
        // detect loop 
        // slow=+1
        // fast = +2;
          public static boolean check_Loop(){
            Node slow=head;
         Node fast=head;
         while (fast!=null && fast.next!=null) {
             slow=slow.next;
             fast=fast.next.next;
             if (slow==fast) {
                return true;
             }
         }
          return false;
          }
                                  public static void remove_cyc(){
                                    boolean cycle=false;
                                    Node slow=head;
                                    Node fast=head;
                                     while (fast!=null && fast.next!=null) {
                                         slow=slow.next;
                                         fast=fast.next.next;
                                          if (slow==fast) {
                                            cycle=true;
                                            break;
                                          }
                                     }
                                       slow=head;
                                       Node prev=null;
                                        while (slow!=fast) {
                                             prev=fast;
                                             slow=slow.next;
                                             fast=fast.next;
                                        }
                                        prev.next=null;
                                  }
         
    public static void main(String[] args) {

         head=new Node(5);
         Node temp=new Node(10);
         head.next=temp;
         head.next.next=new Node(15);
         head.next.next.next=new Node(20);
         head.next.next.next.next=temp;
         System.out.println("is there a loop "+check_Loop());
         remove_cyc();
         System.out.println(check_Loop());
    }
}
