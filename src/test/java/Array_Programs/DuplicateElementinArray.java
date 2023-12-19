package Array_Programs;

public class DuplicateElementinArray {

    public static void main(String[] args) {
        String names[] = {"felix", "raj", "felix", "sashwin", "rathan", "binu", "kumar", "binu"};

        boolean flag = false;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {
                    System.out.println("the duplicate value is :" + names[i]);
                    flag = true;
                }
            }

        }
        if (
                flag == false

        )
            System.out.println("duplicate value is not found");
    }
}
