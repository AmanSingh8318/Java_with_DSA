public class Node_Operation {
      
       public class Node{
        int data;
        Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
       }  

                            // add node at first 

                                public void Add_first(int data){
                                    // create a new node 
                                    Node newnNode=new Node(data);
                                    if (Head==null) {
                                        Head=Tail=newnNode;
                                    }
                                    size++;
                                    newnNode.next=Head;
                                    Head=newnNode;
                                    Tail.next=null;
                                }
             // add node at last
             public void Addlast(int data){
                Node newnNode=new Node(data);
                if (Head==null) {
                    Head=Tail=newnNode;
                    return;
                }
                size++;
                Tail.next=newnNode;
                Tail=newnNode;
                Tail.next=null;
             }

    // add specified position 
    public void AddAtPosition(int data,int position){
        Node newNode=new Node(data);
        Node temp=Head;
        int i=0;
        if (Head==null) {
            Add_first(data);
            return;
        }
        size++;
         while (i<position-1) {
             temp=temp.next;
             i++;
         }
         newNode.next=temp.next;
         temp.next=newNode;
        
    }
    
                                public void Print(){
                                    Node temp=Head;
                                    while (temp != null) {
                                        System.out.print(+temp.data+" => ");
                                        // System.out.println();
                                        temp=temp.next;
                                    }
                                }
        public void Del_First(){
             if (size==0) {
                System.out.println("Linkedlist is empty ");
                return;
             }
             else if (size==1) {
                Head=Tail=null;

             }
             size--;
            Head=Head.next;
        }
                                   public void Del_Last(){

                                    Node prevNode=Head;
                                        if (size==0) {
                                        System.out.println("Linkedlist is empty");
                                        return;
                                        }else if (size==1) {
                                            Head=Tail=null;
                                            size=0;
                                        }
                                        int i=0;
                                         while (i<size-2) {
                                            prevNode=prevNode.next;
                                            i++;
                                         }
                                    
                                        prevNode.next=null;
                                        Tail=prevNode;
                                   }
            public int Search(int key){
                Node temp=Head;
                int i=0;
                while (temp!=null) {
                    if (temp.data==key) {
                        return temp.data;
                    }
                    temp=temp.next;
                    i++;
                }
                return -1;
            }
                                     public int Recurive(int key,Node Head){
                                        Node temp=Head;
                                         if (Head==null) {
                                            return -1;
                                         }
                                           if (temp.data==key) {
                                            System.out.println("key is found");
                                            return 0;
                                           }else {
                                            System.out.println("key is not found ");
                                           }
                                         Recurive(key , Head.next);

                                         return -1;
                                     }
        // using the helper function 
         
                 public int helperFn(Node Head,int key ){
                    if (Head==null) {
                        return -1;
                    }
                    if (Head.data==key) {
                        return 0;
                    }
                    int idx=helperFn(Head.next, key);
                    if (idx==-1) {
                        return -1;
                    }
                    else {
                        return idx+1;
                    }
                 }
                                        
                     public void Reverse_LL(){
                           Node curr=Tail=Head; 
                           Node prev=null;
                           Node next=Head;
                           while (curr!=null) {
                            next=curr.next;
                            curr.next=prev;
                            prev=curr;
                            curr=next;
                           }
                           Head=prev;
                     }
    
             public int recSearch(int key ){
                return helperFn(Head, key);
             }
       public static Node Head;
       public static Node Tail;
       public static int size;
       
    public static void main(String[] args) {
        Node_Operation n1=new Node_Operation();
        n1.Add_first(20);
        n1.Add_first(10);
        n1.Addlast(40);
        n1.AddAtPosition(30, 2);
        n1.Print();
        System.out.println();
        n1.Del_First();

        n1.Print();
        System.out.println();
        // n1.Del_Last();
        n1.Print();
        System.out.println();
        // System.out.println(n1.Search(20));
        //    System.out.println(n1.Recurive(230, Head));
        System.out.println(n1.recSearch(40));
        System.out.println();
        n1.Reverse_LL();
        n1.Print();
        System.out.println( "Total size of the linkedlist is "+n1.size);
    }
}
