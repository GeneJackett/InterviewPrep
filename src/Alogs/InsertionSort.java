package Alogs;

public class InsertionSort {
    public static void insertionAlgo(){
        //DataStruct
        int ageNum [] = new int[] {11, 15, 16, 39, 85, 100, 10, 40};

        //temp var
        int temp = 0;
        int current = 0;

        for (int x = 1; x < ageNum.length; x++){
            current = ageNum[x];
            temp = x;
           if(current < ageNum[x] ){
               temp = ageNum[x];

           }
        }

        int finished_insertion = 0;
        System.out.println(finished_insertion);
    }
}
