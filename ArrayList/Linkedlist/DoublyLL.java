public class DoublyLL {
       
        public class Node {
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
        public static int size;
                                    public void Add_first(int data){
                                        Node new_node=new Node(data);
                                        if (head==null) {
                                            head=tail=new_node;
                                            return;
                                        }
                                        size++;
                                        new_node.next=head;
                                        head.prev=new_node;
                                        head=new_node;
                                    }
    public void Print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<>");
            temp=temp.next;
        }
        System.out.print(" null");
    }
                                          public void Remove_first(){
                                            if (head==null) {
                                                System.out.println("Doubly Linkedlist is empty");
                                                return;
                                            }
                                            if (size==1) {
                                               head=tail=null;
                                               size--;
                                            }
                                            head=head.next;
                                            head.prev=null;
                                          }

        public void Add_last(int data){
            Node new_node=new Node(data);
            if (head==null) {
                head=tail=new_node;
                return;
            }
            size++;
            tail.next=new_node;
            new_node.prev=tail;
            tail=new_node;
        }
                                        public void Remove_last(){
                                            if (head==null) {
                                                System.out.println("DL  is empty");
                                                return;
                                            }
                                            Node prev=head;
                                            if (size==1) {
                                                head=tail=null;
                                            }
                                            int i=0;
                                                while (i<size-2) {
                                                    prev=prev.next;
                                                    i++;
                                                }
                                                prev.next=null;
                                                tail=prev;
                                        }
      public static void main(String[] args) {
        DoublyLL D1=new DoublyLL();
        D1.Add_first(10);
        D1.Add_first(20);
        D1.Add_first(30);
        D1.Print();
        System.out.println();
        D1.Remove_first();
        D1.Print();
        System.out.println();
        D1.Add_last(40);
        D1.Add_last(50);
        D1.Print();
        System.out.println();
        D1.Remove_last();
        D1.Print();
    }
}
