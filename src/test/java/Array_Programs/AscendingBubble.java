package Array_Programs;

import java.util.Arrays;

public class AscendingBubble {

    //This is ascending sort

    public static void main(String[] args) {

        int array[]={5,3,1,4,2};

        int n=array.length;

        System.out.println("Before sort :" + Arrays.toString(array));

        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]>array[j+1]) {//if second value is greater than first variable

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Before sort :" + Arrays.toString(array));
    }
}
