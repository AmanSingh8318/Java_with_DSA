 import java.util.Scanner;;
public class funcoverload {
    public static int sum(int a,int b)
    {
        
        return a+b;
    }
    public static float sum(float c,float d)
  {
    return c+d;
  }    
  public static void main(String[] args) {
   System.out.println (sum(4,6));
   System.out.println (sum(2.3f,3.8f));
  }
}
