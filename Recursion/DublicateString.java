/**
 * DublicateString
 */
public class DublicateString {
        public static void dublicateStr(StringBuilder  newStr,int i ,boolean map[],String str){
             if (i==str.length()) {
                System.out.println(newStr);
             }
             char currStr=str.charAt(i);
             if (map[currStr -'a']== true) {
                dublicateStr( newStr, i+1,map, str);
                return;
             }else {
                map[currStr -'a']=true; 
                    dublicateStr( newStr.append(str), i+1, map, str);
             }
        }
    public static void main(String[] args) {
        String str="apnnacollege";
        dublicateStr( new StringBuilder(), 0,new boolean[26],str);        
 
    }

}