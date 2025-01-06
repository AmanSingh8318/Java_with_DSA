/**
 * Intro_arraylist
 */
 import java.util.ArrayList;
public class Intro_arraylist {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        //   int get=arr.get(2);
        //   System.out.println("Element at index 2 is: "+get);
        // arr.remove(2);
        // arr.set(2, 100);
        // System.out.println(arr);
        // System.out.println(arr.contains(220) );


          // if i want ot itterate  on the list then use 

          for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+"   ");
          }
    }
}