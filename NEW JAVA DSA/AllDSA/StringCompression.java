public class StringCompression {

    public static String compressString(String str){
        String strs="";
        for (int i = 0; i <str.length(); i++) {
            Integer count=0;

            count=1;
            while (i<str.length()-1 &&  str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++;
            }
            strs+=str.charAt(i);
            if (count>1) {
                strs+=count.toString();
            }

        }
        return strs;
    }
    // using stringbuilder method
    public  static void compressStr(String str){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i <str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                 count++;
                 i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";

        // System.out.println(compressString(str));
        compressStr(str);
    }
}
