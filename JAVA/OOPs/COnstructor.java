package OOPs;

public class COnstructor {
   public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student("Aman Singh");
Student s3=new Student(1001);

    System.out.println(s1);
    System.out.println(s2.name);
    System.out.println(s3.rollno);
   } 
}

class Student{
    String name;
    int rollno;
        //Non-parametrized COnstructor
    Student (){
        System.out.println("constructor is being called");

    }
    // parametrized Constructor
    Student(String name){
       this.name=name;
    }
    Student (int rollno){
        this.rollno=rollno;
    }
}
