package OOPs;

public class CopyCOns {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.name="Aman Singh";
       s1.rollNo=121;
        s1.marks=101;
       System.out.println(s1.name);
       System.out.println(s1.rollNo);
       System.out.println(s1.marks);
    //    s1.marks=10001;
       Student s2=new Student(s1); 
       System.out.println("the copied value is "+s2.name);
       System.out.println("the copied value is "+s2.rollNo);
       System.out.println("the copied vlue is"+ s2.marks);
    }
}

class Student{
    String name;
    int rollNo;
        int marks;
        // copy constructor
        Student(Student s1){
                this.name=s1.name;
                this.rollNo=s1.rollNo;
                this.marks=s1.marks;
        }
        // default constructor
        Student(){

        }
}
