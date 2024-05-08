/*
Program to find the minimum (or maximum) element of an array
 */
public class FindminAndMax
{
    public static void main(String[] args){
        int[] array = {1,423,6,46,34,23,13,53,4};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       for(int element:array){
           System.out.println(element);
       }
       System.out.println("minimum element "+array[0]+" and maximum element is "+array[array.length-1]);
    }
}
/*
Output
1
4
6
13
23
34
46
53
423
minimum element 1 and maximum element is 423

 */
