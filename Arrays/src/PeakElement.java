/*
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15,
both of them are less than 20.
 */
public class PeakElement {

    public static void main(String[] args){
        //int[] array = {5,10,20,15}; //output 20
        //int[] array = {10, 20, 15, 2, 23, 90, 67};//output =20, 90
        int[] array = {1, 3, 20, 4, 1, 0};//ooutput 20
        for(int i=0;i<array.length-1;i++){
//            int leftneighbor = array[i-1];
//            int rightneighbor = array[i+1];
            if(i==0 || i==array.length-1){
                continue;
            }
            else{
                int leftneighbor = array[i-1];
                int rightneighbor = array[i+1];
                if(leftneighbor<array[i]&& rightneighbor<array[i]){
                    System.out.println(array[i]);
                }
            }
        }
    }

}
