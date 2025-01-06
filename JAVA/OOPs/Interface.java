package OOPs;

public class Interface {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();

        Lion l1=new Lion();
        l1.eat();

        Tiger t1=new Tiger();
            t1.eat();
    }
      
}
//  define the blueprint of the class
interface  Animal{
      void eat();
}
// class
  class Horse implements Animal{
     public void eat(){
System.out.println("Eat something");
    }
  }
//   class
   class Lion implements Animal{
    public void eat(){
        System.out.println("eat non-veg ");
    }
   } 
// 
   class Tiger implements Animal{
    public void eat(){
        System.out.println("Eat non-veg also");
    }
   }