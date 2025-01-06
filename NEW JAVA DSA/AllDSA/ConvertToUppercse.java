public class ConvertToUppercse {
    public static void convertUppcase(String str){
        StringBuilder sb=new StringBuilder("");
                    // store fist letter in ch

            char ch=str.charAt(0);
            //append ch into sb that is tring builder & also convert into uppercase
            sb.append(Character.toUpperCase(ch));
            for (int i = 1; i <str.length(); i++) {
            // if str[i] empty then appned space and inc i then append &convert to uppercase
                if (str.charAt(i)== ' ' && i<str.length()-1) {
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
                else{
                    // remain after first letter of sentence append
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="hi i am aman";
convertUppcase(str);
    }
}
