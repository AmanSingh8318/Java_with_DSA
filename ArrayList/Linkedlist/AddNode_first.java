public class AddNode_first {
      
         public static class Node{
            int data;
            Node next;
              public Node(int data){
                this.data=data;
                this.next=null;
              }
         }  
           // create static type of head and tail thats why we use any where in the particular class
         public static Node head;
         public static Node tail;
            // why not use static beacuse we create the object of the AddNode_first 
            // and all the task is performed under this class and the main class is also is static
            // thats why we dont use the static 
            // we use static in this case if the particular class is the outside of the main class 
          
            // create a Add function 
              public void Add(int data){
            // create a new node 

            Node newNode=new Node(data);
            if (head == null) {
                head=tail=newNode;

                return;
            }
               newNode.next=head;
               head=newNode;
           }
          // Print function  
           
         


             public void prevAdd(int data){
                Node newNode=new Node(data);
                if (head==null) {
                    head=tail=newNode;
                    return;
                }
                    tail.next=newNode;
                    tail=newNode;
                    tail.next=null;
             } 

             public void addMiddle(int idx,int data){
                 Node newnNode=new Node(data);

                      if (idx==0) {
                        Add(data);
                        return;
                      }
                 Node temp=head;
                 int i=0;
                 while (i<idx-1) {
                    temp=temp.next;
                    i++;
                 }
                 newnNode.next=temp.next;
                 temp.next=newnNode;
             }
             public void Print(){
                Node temp=head;
                while (temp != null) {
                    System.out.print(temp.data);
                    System.out.println();
                    temp=temp.next;

                }
              }
          public static void main(String[] args) {
             AddNode_first A1=new AddNode_first();
             A1.Add(30);
             A1.Add(20);
             A1.Add(10);
             A1.prevAdd(40);
             A1.prevAdd(50);
            A1.addMiddle(0, 100);
             A1.Print();
          }
}
