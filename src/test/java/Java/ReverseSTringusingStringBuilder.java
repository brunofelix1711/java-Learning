package Java;

public class ReverseSTringusingStringBuilder {
    public static void main(String[] args) {

       String name="my name is automation";

       StringBuilder builder=new StringBuilder(name);

       name=builder.reverse().toString();

       System.out.println(name);
    }
}
