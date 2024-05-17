//ist of important array methods and techniques that are frequently used
import java.util.*;

import static java.util.Comparator.*;

public class ArrayMethods {
    public static void main(String[] args){
        //Declatarion and initializatoin of array
        int[] array1 = new int[10];
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4,5};

        //length of array
        int array1length= array1.length;
        System.out.println("Length:- "+array1length);

        //sorting an array
        Arrays.sort(array2);

        //Binary Search an array
        int index = Arrays.binarySearch(array2,4);

        //fill entire array with specified value
        Arrays.fill(array1, 2);
        Arrays.fill(array2,/*fromIndex*/ 3, /*toIndex*/ 6,/*value*/ 5);

        //copy and array
        int[] newArray = Arrays.copyOf(array1,/*newLength*/ 7);
        int[] newArray1 = Arrays.copyOfRange(array1,2,5);

        //check if two array are equal
        boolean isEqual = Arrays.equals(array1,array2);

        //sort an array in reverseOrser());
//        Arrays.sort(array3, Comparator.reverseOrder()); // Sorts in descending order

        //Dynamically Increasing Array Length by 1
        int[] newArray3 = Arrays.copyOf(array2, array2.length+1);
//        newArray[1] = array2[]

        int[] a = {1,2,3,4};
        a = Arrays.copyOf(array1,array1.length+1);
        a[a.length+1]=2;

    }

}
