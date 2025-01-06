public class Stringbuilder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
            String chars[]={};
        String ch[]={"a","a","b","b","c","c","c"};
        for (int i = 0; i < ch.length; i++){

            Integer count=1;

            while (i>ch.length-1&&ch[i]==ch[i+1] ) {
                count++;

                i++;

            }
            sb.append(chars);

            if (count>0) {
                sb.append(count.toString(i));
            }

            System.out.println(sb.charAt(i));

        }

        
    }
    
}
