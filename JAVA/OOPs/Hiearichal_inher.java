package OOPs;

public class Hiearichal_inher {
public static void main(String[] args) {
    Birds b1=new Birds();
    b1.Breath();
    b1.fly();
    Fish f1=new Fish();
    f1.Swin();
    f1.Breath();
}
}


class Animals{
    int no;
    void Breath(){
        System.out.println("take a breath to alive");
    }
}

class Birds extends Animals{
      void fly(){
        System.out.println("birds are flying");
      }
}


class Fish extends Animals{
    void Swin(){
        System.out.println("Fish are Swins");
    }
}