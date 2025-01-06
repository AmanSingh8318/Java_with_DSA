public class LargestString {

    public static void printLargest_string(String str[]){
            String largerst=str[0];
        for (int i = 1; i < str.length; i++) {
       //  use a special function to compare the string Compareto()
            // 1 conditon  str1.compareTo(str2)==0 equal
            // 2 str1.compareTo(str2)<0
            //str1<str2
                        // 3 str1.compareTo(str2)<0
            //str1<str2
            
                      if (largerst.compareTo(str[i])<0) {
                        largerst=str[i];
                      }  
                    
            }
            System.out.println(largerst);
        }
    

         public static void largeString(String str[]){
            String max="";
           for (int i = 0; i < str.length; i++) {
            if (str[i].length()>max.length()) {
                max=str[i];
            }
           }
           System.out.println("the largest string is"+" "+max);
         }
         public static void smallString(String str[]){
            String min=str[0];
           for (int i = 0; i < str.length; i++) {
            if (str[i].length()<min.length()) {
                min=str[i];
            }
           }
           System.out.println("the smallest String is "+" "+min);
         }

    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};
        // printLargest_string(str);
        largeString(str);
        smallString(str);
    }
}
