/**
 * Implement_Arr
 */
public class Implement_Arr {

     public static class Queue{
         static int arr[];
         static int size;
         static int rear=-1;
          public Queue(int n){
            arr=new int[n];
            size=n;
          }


                                        public static  boolean is_Empty(){
                                            return rear==-1;
                                        }

        public static void Add(int data){
                if (rear==size-1) {
                    System.out.println("Queue is full");
                    return;
                }
                rear=rear+1;
                arr[rear]=data;
        }
                                                        public static int Remove(){
                                                             int front=arr[0];
                                                            if (is_Empty()) {
                                                                System.out.println("Queue is empty");
                                                                return -1;
                                                            }
                                                             for (int i = 0; i <rear; i++) {
                                                                arr[i]=arr[i+1];
                                                             }
                                                             rear=rear-1;
                                                             return front;
                                                        }
        public static int is_peek(){
            if (is_Empty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
     }



                            public static void main(String[] args) {
                                 Queue q1=new Queue(5);
                                 q1.Add(1);
                                 q1.Add(2);
                                 q1.Add(3);
                                 q1.Add(4);
                                 q1.Add(5);


                                 while (!q1.is_Empty()) {
                                  System.out.println(q1.is_peek());
                                  q1.Remove();  
                                 }
                            }
                        }