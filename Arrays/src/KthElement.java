import jdk.dynalink.Operation;

/*
K’th Smallest/Largest Element in Unsorted Array
 */
import java.util.*;
public class KthElement {
    public static void main(String[] args){
        int[] array = {7, 10, 4, 3, 20, 15};
        int k=3;
        Arrays.sort(array);
        for(int element:array){
            System.out.println(element);
        }
        OperationArray op = new OperationArray();
        int kThMin = op.kThMinEle(array, k);
        System.out.println(k+"Th Smallest Element "+kThMin);
        int kThMax = op.kThMaxEle(array,k);
        System.out.println(k+"Th Largest Element "+ kThMax);
    }
}
class OperationArray{
    int kThMinEle(int[] array, int k){
    int kthmin=0;
    kthmin = array[k-1];
    return kthmin;
    }

    int kThMaxEle(int[] array, int k){
        int kthmax = 0;
        kthmax = array[array.length-k];
        return kthmax;
    }
}
/*
output
3
4
7
10
15
20
3Th Smallest Element 7
3Th Largest Element 10
 */