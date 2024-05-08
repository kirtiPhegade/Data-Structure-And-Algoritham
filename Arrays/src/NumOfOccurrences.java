import java.util.Arrays;
/*
Count number of occurrences (or frequency) in a sorted array
 */
public class NumOfOccurrences {
    public static void main(String[] args){
        int[] array = {1,2,2,2,4,3,4,5};
        Arrays.sort(array);
        int number = 2;
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                count++;
            }
        }
        System.out.println(number+" occurred "+count+" times");

    }
}
/*
output
2 occurred 3 times
 */