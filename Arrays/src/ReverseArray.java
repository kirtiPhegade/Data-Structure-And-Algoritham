/*
reverse array
Input: original_array[] = {1, 2, 3}
Output: array_reversed[] = {3, 2, 1}
 */
import java.util.*;

public class ReverseArray
{
    public static void main(String[] args){
        int[] array = {7,6,5,4,3,2,1};
        //first sort array
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
/*
output
7
6
5
4
3
2
1

 */