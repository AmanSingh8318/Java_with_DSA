package Array;

public class COntainer_with_most_water {

                            public static void Most_Water(int arr[]){
                                int height=0;
                                int width=0;
                                int total=0;
                                int max_water=0;
                                for (int i = 0; i < arr.length; i++) {
                                    for (int j = i+1; j < arr.length; j++) {
                                     height=Math.min(arr[i], arr[j]);
                                        width=j-i;
                                        total=height*width;

                                        max_water=Math.max(total, max_water);
                                    }
                                }
                                System.out.println("The Most Water of the container is "+max_water);
                            }
 
       public static void main(String[] args) {
         int arr[]={1,8,6,2,5,4,8,3,7};
         Most_Water(arr);
       }
}
