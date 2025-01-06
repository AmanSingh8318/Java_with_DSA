public class pallindromnum {

    public static void checkPall(int num){
             int reverse=0;
             int originalNum=num;
        while (num>0) {
            int digit=num%10;
                reverse=reverse*10+digit;
                num=num/10;
        }  
        if (reverse==originalNum) {
            System.out.println("no is pallindrome");
        }else{
            System.out.println("no is not pallindrome");
        }
    
    }
    public static void main(String[] args) {
        int num=12221;
        checkPall(num);
    }
}
