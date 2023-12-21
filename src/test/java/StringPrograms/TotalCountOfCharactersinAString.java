package StringPrograms;

public class TotalCountOfCharactersinAString {
    public static void main(String[] args) {
        String name = "bruno felix";

        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) != ' ') {
                count++;

            }

        }
        System.out.println("the total count " + count);
    }
}
