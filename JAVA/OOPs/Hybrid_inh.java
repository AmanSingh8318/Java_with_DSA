package OOPs;

public class Hybrid_inh {
   public static void main(String[] args) {
    Dog d1=new Dog();
    System.out.println("first hierachy");

    d1.Dogs();
    d1.breath();
    d1.Mammals();
    System.out.println("Second hierachy");
    Peacock p1=new Peacock();
    p1.Birds();
    p1.breath();
    p1.Peacocks();
    System.out.println("Third hierachy");
      Shark s1=new Shark();
      s1.Sharks();
      s1.Fishes();
      s1.breath();
   } 
}

class Animals{
    void breath(){
        System.out.println("Breath to alive");
    }
}
class Fish extends Animals{
    void Fishes(){
        System.out.println("Fish class");
    }
}
class Bird extends Animals{
    void Birds(){
        System.out.println("Birds classes");
    }
}
 class Mammal extends Animals{
    void Mammals(){
        System.out.println("Mammals classes");
    }
 }

 class Shark extends Fish{
    void Sharks(){
        System.out.println("Shark section under fish class");
    }
 }

 class Peacock extends Bird{
    void Peacocks(){
        System.out.println("peacock section under the Bird class");
    }
 }

 class Dog extends Mammal{
    void Dogs(){
            System.out.println("Dog under the Mammal section");
    }
 }