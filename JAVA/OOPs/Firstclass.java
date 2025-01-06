package OOPs;

/**
 * Firstclass
 */
public class Firstclass {
public static void main(String[] args) {
    Student s1=new Student();
    s1.setAccount(0345234567);
    System.out.println(s1.accountno);
     s1.setName("Aman Singh");
     System.out.println(s1.name);

    //   Fetching another object
    UserInfo s2=new UserInfo();
    s2.setuserName("Aman singh ");
    System.out.println(s2.username);
    s2.setUserFullNmae("Aman singh is a student of BCA");
    System.out.println(s2.user_fullname);
    s2.setUserId(201);
    System.out.println(s2.userid);
}
    
}
  class Student{
   int accountno;
   String name;

   void setAccount(int newNO){
accountno=newNO;
   }
   void setName(String str){
name=str;
   }
}

        class UserInfo{
                String username;
                int userid;
                String  user_fullname;

                void setuserName(String new_name){
                        username=new_name;
                }
                void setUserId(int id){
                    userid=id;
                }
                void setUserFullNmae(String fullname){
                    user_fullname=fullname;
                }
        }