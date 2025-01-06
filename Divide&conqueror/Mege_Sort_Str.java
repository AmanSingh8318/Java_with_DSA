/**
 * Mege_Sort_Str
 */
public class Mege_Sort_Str {



    public static void PrintArr(String str[]){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
         public static void Merge_sort(String str[],int start,int end){
                
                        if (start>=end) {
                             return ;
                        }            
                        int mid=(start+end)/2;
                        // call the recursvie function 

                        Merge_sort(str, start, mid);
                        Merge_sort(str, mid+1, end);  
                        // Merge_all(str,start,mid,end);
                        Merge_all(str, start, mid, end);
         }
             public static void Merge_all(String str[],int start,int mid,int end){
                        // create a temp array to sotre
                        String temp[]=new String[end-start+1];
                int i=start;
                int j=mid+1;
                int k=0;
                         while (i<=mid && j<=end) {
                             if (str[i].compareTo(str[j])<=0) {
                                 temp[k]=str[i];
                                 i++;
                             }  
                             else {
                                temp[k]=str[j];
                                j++;
                             }
                             k++;
                         }
                         // for remaing left part

                         while (i<=mid) {
                            temp[k++]=str[i++];
                         }

                         // for reaming left part 

                         while (j<=end) {
                            temp[k]=str[j++];
                         }  
                         // copy from temp arr to original arr 
                         for ( k = 0 ,i=start; k < temp.length; k++,i++) {
                            str[i]=temp[k];
                         }

             }

                   
    public static void main(String[] args) {
        String str[]={"sun","earth","mars","mercury"};
        Merge_sort(str, 0, str.length-1);
           PrintArr(str);
    }
}