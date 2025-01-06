public class Merge_String {


        public static void PrintArr(String str[]){
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }
     public static void StringSort(String str[],int start,int end)
     {
           if (start>=end) {
              return;
           }
           // calculate mid 
           int mid=(start+end)/2;
           // call the recrusively
           StringSort(str,start,mid);   // for left side
           StringSort(str,mid+1,end);   // for right side
           sortStr(str,start,mid,end);
     }
      
     public static  void sortStr(String str[],int start,int mid,int end){

        // create the temporary array to store the valaues
             String temp[]=new String[end-start+1];
           int i=start;
           int j=mid+1;
           int k=0;

           while (i<=mid && j<=end) {
                if (str[i].compareTo(str[j])<=0) {
                    temp[k]=str[i];
                    i++;   
                }else {
                    temp[k]=str[j];
                    j++;
                }

                k++;
           }
             // for reaming parts left side
           while (i<mid) {
            temp[k++]=temp[i++];
           }

           // for reamining for right side
           while (j<end) {
            temp[k++]=temp[j++];
           }
  /// copy from temp to original array
         for ( k = 0,i=start; k< temp.length; k++,i++) {
            str[i]=temp[k];
         }


     }
    public static void main(String[] args) {
        String str[]={"mango","pineapple","apple","grapes"};
        StringSort(str,0,str.length-1);
        PrintArr(str);
    }
}
