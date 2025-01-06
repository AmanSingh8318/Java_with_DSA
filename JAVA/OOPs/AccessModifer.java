package OOPs;

public class AccessModifer {
   public static void main(String[] args) {
    StudentInfo s1=new StudentInfo();
    s1.setReg_id(101);
    s1.set_nameofStd("Aman Singh");
    //  acdess using the getter method
    System.out.println(s1.getName());
    System.out.println(s1.getId());
   } 
}

class StudentInfo{
    private String name;
  private int reg_id;

//   Getter 
     int getId(){
        return this.reg_id;
    }
    String getName(){
        return this.name;
    }
      void set_nameofStd(String  Newname){
        name=Newname;
      }
    // Setter
  void setReg_id(int newreg_id){
    reg_id=newreg_id;
  }
 


}