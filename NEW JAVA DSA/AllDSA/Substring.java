public class Substring {

    public static void checkSubstring( String str){
          
        for (int i = 0; i <str.length(); i++) {
            int start=i;
            for (int j = 0; j <str.length(); j++) {
                int end=j;
                for (int k = start; k<=end; k++) {
                   System.out.print(str.charAt(k)); 
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="abcde";
        checkSubstring(str);
    }
}
