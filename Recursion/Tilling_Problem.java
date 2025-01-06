public class Tilling_Problem {

    public static int Tiles_prob(int n){
        //  base case 
        if (n==0 || n==1) {
            return 1;
        }

        int horizontal=Tiles_prob(n-2);
        int vertical=Tiles_prob(n-1);
        int total_ways=horizontal+vertical;
        return total_ways;
    }
    
    public static void main(String[] args) {
        int n=4;
        System.out.println(Tiles_prob(n));
    }
}
