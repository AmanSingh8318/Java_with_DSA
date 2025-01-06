public class Implement_using_Linkedlist {
   
 
            public static class Queue{
                public static  class Node{
                    int data;
                    Node next;
                     
                    public Node(int data){
                        this.data=data;
                        this.next=null;
                    }
                } 

                  public static Node head=null;
                  public static Node tail=null;


                            public static boolean is_empty(){
                                   
                                return head==null && tail==null;
                            }


                                                public static void Add(int data){

                                                    Node newNode=new Node(data);
                                                    if (head==null) {
                                                        head=tail=newNode;
                                                        return;
                                                    }
                                                    tail.next=newNode;
                                                    tail=newNode;
                                                    
                                                }
                    public static int Remove(){

                        int front=head.data;
                            if (is_empty()) {
                                System.out.println("queue is empty ");
                                return -1;
                            }
                            if (tail==head) {
                                head=null;
                                tail=null;
                            }else {
                                head=head.next;
                            }

                            return front;
                    }


                                            public static int Peek(){
                                                if (is_empty()) {
                                                    return -1;
                                                }
                                                return head.data;
                                        

                                            }


                 
            }


     
    public static void main(String[] args) {
        
        Queue q1=new Queue();
        q1.Add(1);
        q1.Add(2);
        q1.Add(3);
          
         while (!q1.is_empty()) {
            System.out.println(q1.Peek());
            q1.Remove();
         }
    }
}
