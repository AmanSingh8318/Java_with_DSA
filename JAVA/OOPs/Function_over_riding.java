package OOPs;

/**
 * Function_over_riding
 */
public class Function_over_riding {
public static void main(String[] args) {
       Dogs d1=new Dogs();
       d1.Eat();
       Animal A1=new Animal();
       A1.Eat();
}
    
}

 class Animal{


    void Eat(){
        System.out.println("eat something");
    }
 }
       class Dogs extends Animal{
        void Eat(){
            System.out.println("eat grass");
        }
       }