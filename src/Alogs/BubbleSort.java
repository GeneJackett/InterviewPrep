package Alogs;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(){
        //array to sort
        //correct output 1,3,4,9,23,34,56,199
        int[] array = { 1, 34, 56, 199, 3, 4, 9, 23};

        for (var i=0; i < array.length; i++){
            for (var j=1; j < array.length; j++){
                if (array[j] < array[j-1]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j -1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
