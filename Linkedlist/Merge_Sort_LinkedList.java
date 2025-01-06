/**
 * Merge_Sort_LinkedList
 */
public class Merge_Sort_LinkedList {
            
               public class Node {
                int data;
                Node next;
                public Node(int data){
                    this.data=data;
                    this.next=null;
                }
               }
               public static Node head;
               public static Node tail;

                                        public void Add_node(int data){
                                            Node new_node=new Node(data);
                                            if (head==null) {
                                                head=tail=new_node;
                                                return;
                                            }
                                            new_node.next=head;
                                            head=new_node;
                                        }
         public void Print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" =>");
                temp=temp.next;
            }
            System.out.print("null");

         }

                                            public Node getMid(Node head){
                                                Node slow=head;
                                                Node fast=head.next;
                                                while (fast!=null && fast.next!=null) {
                                                    slow=slow.next;
                                                    fast=fast.next.next;
                                                }
                                                return slow;
                                            }

         public Node Merge(Node head){
        if (head==null || head.next==null) {
          return head;
         }
          Node mid=getMid(head);
           Node rightNode=mid.next;
           mid.next=null;
        Node newLeft=   Merge(head);
        Node newRight=   Merge(rightNode);
             return Merge_All(newLeft,newRight);
         } 
                                         public Node Merge_All(Node head1, Node head2){
                                            Node Merge_data=new Node(-1);
                                            Node temp=Merge_data;
                                            while (head1!=null && head2!=null) {
                                                if (head1.data<=head2.data) {
                                                    temp.next=head1;
                                                    head1=head1.next;
                                                    temp=temp.next;
                                                }else {
                                                    temp.next=head2;
                                                    head2=head2.next;
                                                    temp=temp.next;
                                                }
                                            }

                                            while (head1!=null) {
                                                temp.next=head1;
                                                    head1=head1.next;
                                                    temp=temp.next;
                                            }
                                            while (head2!=null) {
                                                temp.next=head2;
                                                    head2=head2.next;
                                                    temp=temp.next;
                                            }
                                            return Merge_data.next;
                                         } 

   public static void main(String[] args) {
        
        Merge_Sort_LinkedList M1=new Merge_Sort_LinkedList();
        M1.Add_node(10);
        M1.Add_node(2);
        M1.Add_node(30);
        M1.Add_node(40);
        M1.Print();
        System.out.println();
        M1.head=M1.Merge(M1.head);
    //  M1.Merge(head);
      M1.Print();
    }
}