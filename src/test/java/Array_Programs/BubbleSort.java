package Array_Programs;

import java.util.Arrays;

//This is the descending sort

public class BubbleSort {

     static void bubblesort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=1; j<array.length;j++){
                if(array[j]>array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }



    }

    public static void main(String[] args) {

        int[] number={2,7,1,8,4,5};

        bubblesort(number);
System.out.println(Arrays.toString(number));
    }
}
