package Java;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);

        str=sc.nextLine();

        String reverse_string=str.replaceAll("\\s","");
        System.out.println("removed spcases are " + reverse_string);
    }
}
