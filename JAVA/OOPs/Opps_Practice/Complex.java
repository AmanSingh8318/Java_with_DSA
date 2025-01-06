package OOPs.Opps_Practice;

public class Complex {
    public static void main(String[] args) {
          Complexone one= new Complexone();
          System.out.println(one.Sum(10, 20));

          Complexone two=new Complexone();
          System.out.println(two.Diff(10,2));

          Complexone three=new Complexone();
          System.out.println(three.Mul(10,2));
    }
}

   class Complexone{
           static int a;
           static int b;
       int Sum(int a , int b){
           return a+b;
       }
       int Diff(int a ,int b){
        return a-b;
    }
    int Mul(int a,int b){
        return a*b;
    }

   }