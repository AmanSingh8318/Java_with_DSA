public class Find_Subset {

    public static void Check_subset(String str,String ans,int i){
            // base case 
            if (i==str.length()) {
            
                    System.out.println(ans);
                return ;
            }

            // call recursive & backtrack
            Check_subset(str, ans+str.charAt(i), i+1);  // and in ans varible to find subset
            Check_subset(str, ans, i+1);


    }
    public static void main(String[] args) {
        String str="abc";
        Check_subset(str, " ", 0);
    }
}
