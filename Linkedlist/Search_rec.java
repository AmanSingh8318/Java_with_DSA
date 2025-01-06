public class Search_rec {
       
    public  class Node  {
     int data;
     Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

        public static Node head;
        public static Node tail;

         public void Add_first(int data){
            Node newnode=new Node(data);
             if (head==null) {
                head=tail=null;
                return;
             }
             newnode.next=head;
             head=newnode;
         }
        
    }
    public static void main(String[] args) {
        Search_rec s1=new Search_rec();
        
    }
}
