package Array_Programs;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSorting {



    public static void main(String[] args) {

//        this will print the output in ascending order

        int a[]={20,10,80,90,40};

        System.out.println(Arrays.toString(a));

        Arrays.parallelSort(a);

        System.out.println(Arrays.toString(a));

    }

    @Test
  public  void another_method(){

      int a[]={20,10,80,90,40};
        Arrays.sort(a);
      System.out.println(Arrays.toString(a));
    }


    @Test
//this sort the elemet using reverse order
    public  void reverse_order(){

        Integer a[]={20,10,80,90,40};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
