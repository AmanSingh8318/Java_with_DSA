/**
 * Delete_last
 */
public class Delete_last {
  
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
     public static int size;
                                    public void Add_first(int data){
                                        Node new_node=new Node(data);
                                        if (head==null) {
                                            head=tail=new_node;
                                            return;
                                        }
                                        size++;
                                        new_node.next=head;
                                        head=new_node;
                                    }
    public void Add_Last(int data){
        Node new_node=new Node(data);
        if (head==null) {
            head=tail=new_node;
            return;
        }
              size++;
                 tail.next=new_node;
                tail=new_node;
                tail.next=null;
    }
                                            public void Add_mif(int data,int idx){
                                                Node new_node=new Node(data);
                                                Node temp=head;
                                                  if (head==null) {
                                                    head=tail=null;
                                                    return;
                                                  }
                                                  int i=0;
                                                  while (i<idx-2) {
                                                        temp=temp.next;

                                                  }
                                                  size++;
                                                  new_node.next=temp.next;
                                                  temp.next=new_node;
                                            }
        public int searchItt(int key)
        {
            Node temp=head;
            for (int i = 0; i <size; i++) {
                 temp=temp.next;
            }
            if (temp.data==key) {
                return temp.data; 
             }

            return -1;
        }
                                    public void del_first(int data){
                                         if (head==null) {
                                            System.out.println("LL is emptyy");
                                            return;
                                         }else if(size==1){
                                            head=tail=null;
                                         }
                                         head=head.next;
                                    }
        public void del_last(){
            Node temp=head;
            if (head==null) {
                System.out.println("LL is emptyy");
                return;
            }
                for (int i = 0; i <size-2; i++) {
                     temp=temp.next;
                }
                temp.next=null;
                tail=temp;
        }
    public void Print_node(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
           
                                  public static void main(String[] args) {
                                      Delete_last d1=new Delete_last();
                                      d1.Add_first(10);
                                      d1.Add_first(20);
                                      d1.Add_first(30);
                                      d1.Add_Last(80);
                                      d1.Add_mif(60, 2);
                                      d1.Print_node();
                                      System.out.println();
                                      System.out.println("toal size of LL is "+size);
                                      d1.del_first(20);
                                      d1.Print_node();
                                      System.out.println();
                                      d1.del_last();
                                      d1.Print_node();
                                    //   System.out.println(d1.searchItt(20));
                                  }
                              }