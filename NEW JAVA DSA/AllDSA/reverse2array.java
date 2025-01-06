public class reverse2array {

    public  static void reverse(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end --;
        }
    }
    public static void main(String[] args) {
        int []arr={10,70,30,40};
        reverse(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }   
}
