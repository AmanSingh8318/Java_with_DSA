public class Reverse_Doubly_LL {
     public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
                                        head.prev=new_node;
                                        head=new_node;
                                      }

    public void Print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" <>");
            temp=temp.next;
        }
        System.out.print("null");
    }
                                            public void Reverse(){
                                                Node curr=head;
                                                Node prev=null;
                                                Node next;
                                                while (curr!=null) {
                                                    next=curr.next;
                                                    curr.next=prev;
                                                    curr.prev=next;
                                                    prev=curr;
                                                    curr=next;
                                                }
                                                head=prev;
                                            }
    public static void main(String[] args) {
        Reverse_Doubly_LL R1=new Reverse_Doubly_LL();
        R1.Add_first(10);
        R1.Add_first(20);
        R1.Add_first(30);
        R1.Print();
        System.out.println();
        R1.Reverse();
        R1.Print();
    
    }
}
