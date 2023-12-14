package Java;

public class ReverseSTringusingStringBuilder {
    public static void main(String[] args) {

    String name="learn automation online";

    StringBuilder builder =new StringBuilder(name);

    name=builder.reverse().toString();

    System.out.println(name);

    }
}
