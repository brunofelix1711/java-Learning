package RegularExpressions;

public class RemoveSpecialcharacters {

    public static void main(String[] args) {
        String removespecial="()&^%abcd@#1234";
        String afterremoval=removespecial.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(afterremoval);

    }
}
