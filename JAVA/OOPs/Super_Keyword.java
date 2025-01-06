package OOPs;

public class Super_Keyword {
    public static void main(String[] args) {
        Dog d1=new Dog();
        System.out.println(d1.Dogcolor);
    }
}

   class Animal{
   String Dogcolor;
       Animal(){
        System.out.println("constructor is called");
       }
   }

   class Dog extends Animal{
    Dog(){
        super(); // it directly refers to parent class of the object
        super.Dogcolor="red";

        System.out.println("Cnstructor is called under the child class");
    }
   }