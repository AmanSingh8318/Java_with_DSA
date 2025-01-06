
   import java.util.ArrayList;
public class Target_sum {
      
       public static void checkTarget_Sum(ArrayList<Integer>list){
            
        int Target=5;
         for (int i = 0; i <list.size(); i++) {
           for (int j = i+1; j <list.size(); j++) {
               if (list.get(i)+list.get(j)==Target) {
                   System.out.println("pair sum is "+list.get(i)+" "+list.get(j));
               }
           }  
         }
         
       }
  public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
    checkTarget_Sum(list);
  }   
}
