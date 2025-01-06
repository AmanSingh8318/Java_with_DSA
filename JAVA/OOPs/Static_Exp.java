package OOPs;

public class Static_Exp {
    public static void main(String[] args) {
          Student s1=new Student();
          s1.School_name="SSCA";
          System.out.println(s1.School_name);
          //creating another object 
          Student s2=new Student();
          System.out.println(s2.School_name);
    
    }
}

class Student {
    String name;
    int rool_no;
    static String School_name;

    void setName(String name){
                this.name=name;
    }
    String GetName(){
        return name;
    }
}