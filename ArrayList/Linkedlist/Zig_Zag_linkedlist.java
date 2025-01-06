public class Zig_Zag_linkedlist {

        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
                                        public void Add_first(int data){
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
                                                    Node fast=head;
                                                     while (fast!=null && fast.next!=null) {
                                                        slow=slow.next;
                                                        fast=fast.next.next;
                                                     }
                                                     return slow;
                                                }
    public void Merge_zig_Zag(){
        // reverse a linkedlist 
        Node mid=getMid(head);
        Node curr=mid;
        // mid.next=null;
        Node prev=null;
        Node next; 
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // Merge in  alternate way
        Node leftHead=head;
        Node rightHead=prev;
        Node left,right;
           while (leftHead.next!=null && rightHead.next!=null) {
              left=leftHead.next;
              leftHead.next=rightHead;
              right=rightHead.next;
              rightHead.next=left;
              leftHead=left;
              rightHead=right;
           }
    }
                                    public static void main(String[] args) {
                                        Zig_Zag_linkedlist z1=new Zig_Zag_linkedlist();
                                         z1.Add_first(6);
                                        z1.Add_first(5);
                                        z1.Add_first(4);
                                        z1.Add_first(3);
                                        z1.Add_first(2);
                                        z1.Add_first(1);
                                        z1.Print();
                                        System.out.println();
                                        z1.Merge_zig_Zag();
                                        z1.Print();
                                    }   
                                    }
