package Array_Programs;

public class FindaelementinArray {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int search_int = 150;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search_int) {
                System.out.println("the element is found: " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("the element is not found");
        }
    }
}
