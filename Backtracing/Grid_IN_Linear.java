public class Grid_IN_Linear {

     public static void findway_Grid(String str,String ans){
          if (str.length()==0) {
            System.out.println(ans);
            count++;

            return;
          }

          for (int i = 0; i < str.length(); i++) {
             char c=str.charAt(i);
             String NewStr=str.substring(0, i)+str.substring(i+1);
             findway_Grid(NewStr, ans+c); 
          }
     }

     static int count=0;
    public static void main(String[] args) {
        String str="abcd";
        findway_Grid(str," ");

        System.out.println("total ways is "+count);
    }
}
