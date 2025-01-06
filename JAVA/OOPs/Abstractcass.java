package OOPs;

public class Abstractcass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
    }
}

// abstrcact class give the idea mot the implementation
abstract class Animal{
   abstract void eat();
}

 class Horse extends Animal{
     void eat(){
        System.out.println("Abstarct class");
     }
 }