public class arrStr {

    
    public static void main(String[] args) {

        String a[]={"abc"};
        for (int i = 0; i < a.length; i++) {
            int start=i;
            for (int j = i; j < a.length; j++) {
                int end=j;
                for (int k = start; k <end; k++) {
                    System.out.print(a[0].charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
