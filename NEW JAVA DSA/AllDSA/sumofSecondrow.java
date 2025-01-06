public class sumofSecondrow {

    public static int Sumofrow(int arr[][]){
        int sum=0;
        int row=1;// we want to add the seond row thats why initalized row =1;
        int col=arr[0].length-1;
            
        for (int j = 0; j <=col; j++) {
            sum+=arr[row][j];
        }
    
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(Sumofrow(arr));
    }
}
