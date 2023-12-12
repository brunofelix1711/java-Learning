package Java;

import java.util.Scanner;

public class Swaptwonumbersusingthirdvariable {

    public static void main(String[] args) {

        int x, y, t;

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the values of X and Y");

        x = sc.nextInt();

        y = sc.nextInt();

        System.out.println("Before Swapping " +x +" "+ y);

        t=x;

        x=y;

        y=t;

        System.out.println("after Swapping " +x +" "+ y);
    }
}
