/**
 * stack_in_LL
 */
public class stack_in_LL {
               
                public static class Node{
                    int data;
                    Node next;
                    public Node(int data){
                        this.data=data;
                        this.next=null;
                    }
                }
                public static Node head;

                                            public static class Stack{

                                                public static boolean isEmpty(){
                                                     return head==null;
                                                }

                public static void Push(int data){
                    Node newNode=new Node(data);
                    if (head==null) {
                        head=newNode;
                        return;
                    }
                    newNode.next=head;
                    head=newNode;
                }
                                          public static int Pop(){   
                                            int top=head.data;
                                            head=head.next;
                                            return top;
                                          }

                public static int Peek(){
                        return head.data;
                }
                                               
                                            }
    public static void main(String[] args) {
         Stack s1=new Stack();
         s1.Push(10);
         s1.Push(20);
         s1.Push(30);
           
        while (!s1.isEmpty()) {
            System.out.println("Top of the stack is "+s1.Peek());
            s1.Pop();
        }
    }
}