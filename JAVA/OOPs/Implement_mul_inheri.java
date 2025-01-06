package OOPs;

public class Implement_mul_inheri {
    public static void main(String[] args) {
        New_Supercar car=new New_Supercar();
        car.Engine();
        car.Speed();
        car.model();
    }
}


// merge tata and maruti to make new car
// it makes a concept of multiple Inheritance
            interface Maruti{
            void Speed();
            void Engine();
            }

            interface Tata{
                void model();
                
            }

        class New_Supercar implements Maruti,Tata{
               public void Speed(){
                System.out.println("it have a high speed");
               }
               public void Engine(){
                System.out.println("it have a powerfull engine");
               }
               public void model(){
                System.out.println("new model launche");
               }

        }
             