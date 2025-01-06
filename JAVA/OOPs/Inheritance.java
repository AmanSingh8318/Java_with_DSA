package OOPs;

public class Inheritance {
    public static void main(String[] args) {
    Fish f1=new Fish();
    f1.breaths();
    f1.eats();  
    f1.live();
    }
}

class Animals{
    // int eat;
    // int breath;
    void eats(){
            System.out.println("Eating eating ");
    }

    void breaths(){
        System.out.println("Beaths to alive");
    }
}


class Fish extends Animals{
    void live(){
        System.out.println("i Am alive");
    }
}