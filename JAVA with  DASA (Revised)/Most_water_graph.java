public class Most_water_graph {


              public static void calculate_water(int heights[]){
                  int height=0;
                  int width=0;
                  int total_water=0;
                  int start=0;
                  int end=heights.length-1;
                    while (start<end) {
                        
                        height=Math.min(heights[start], heights[end]);
                        width=end-start;
                        int total=height*width;
                        total_water=Math.max(total,total_water );

                        if (heights[start]<heights[end]) {
                            start++;
                        }else {
                            end--;
                        }
                    }
                    System.out.println(total_water);
              }
    public static void main(String[] args) {
        int heights[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
      calculate_water(heights);

    }
}
