package Java;

public class ReverseStringwithoutInbuildfunction {
    public static void main(String[] args) {

        String name = "Automation learning";


        String reversename = "";

        for (int i = name.length() - 1; i >= 0; --i) {
            reversename += name.charAt(i);
        }
        System.out.println(reversename);
    }
}