package Java;

public class ReverseStringwithoutInbuildfunction {
    public static void main(String[] args) {

        String letter="Automation";

        String reverseletter="";

        for(int i=letter.length()-1;i>=0;--i)
{
    reverseletter+=letter.charAt(i);
    }
System.out.println(reverseletter);
}
}