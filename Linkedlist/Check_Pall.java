public class Check_Pall {
      
                                    public class Node{
                                        int data;
                                        Node next;
                                        public Node(int data){
                                            this.data=data;
                                            this.next=null;
                                        }
                                    } 
        public void Add_Node(int data){
            Node newnode=new Node(data);
             if (head==null) {
                 head=tail=newnode;
                 return;
             }
             newnode.next=head;
             head=newnode;
        }
                                        public void PrintLL(){
                                            Node temp=head;
                                             while (temp!=null) {
                                                 System.out.print(temp.data+" =>");
                                                 temp=temp.next;
                                             }
                                             System.out.print("Null");

                                        } 
     // first step find Mid Node 
     // reverse the half LL
     // if right_node == left_node return  true means pallindrome 
      
      public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
         while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
      }
                                            public boolean checkISPall(){
                                                // base case 
                                                if (head==null || head.next==null) {
                                                    return true;
                                                }
                                                // 1st step find mid 

                                                Node midNode=findMid(head);

                                                // reverse the half LL 
                                                Node prev=null;
                                                Node curr=midNode;
                                                Node next;
                                                 while (curr!=null) {
                                                    next=curr.next;
                                                    curr.next=prev;
                                                    prev=curr;
                                                    curr=next;
                                        
                                                 }

                                                 Node right=prev;  //head of right Node
                                                 Node left=head;
                                                 while (right!=null) {
                                                    if (left.data!=right.data) {
                                                        return false;
                                                    }
                                                    left=left.next;
                                                    right=right.next;
                                                 } 
                                                 return true;
                                            }
          
      public static Node head;
      public static Node tail;
        public static void main(String[] args) {
           Check_Pall c1=new Check_Pall();
           c1.Add_Node(1);
           c1.Add_Node(2);
           c1.Add_Node(2);
           c1.Add_Node(1);
           c1.PrintLL();
           System.out.println();
           System.out.println(c1.checkISPall());
        }
        }
