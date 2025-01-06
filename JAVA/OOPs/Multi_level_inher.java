package OOPs;

public class Multi_level_inher {
    public static void main(String[] args) {
        Third t3=new Third();
        t3.goal();
        t3.setGoal();
        t3.Achieve();
    }
}

class First{
    int a;
    int b;
    void goal(){
        System.out.println("Set your Goal");
    }
    
}

class Second extends First{
    void setGoal(){
        System.out.println("Fixed your goal");
    }
}

class Third extends Second{
    void Achieve(){
        System.out.println("FInaaly Reached at the Goal");
    }
}