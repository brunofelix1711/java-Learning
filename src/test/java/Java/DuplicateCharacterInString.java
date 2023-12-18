package Java;

public class DuplicateCharacterInString {

    public static void main(String[] args) {

        String str=new String("automationonline");
        int  count=0;
        char[] ch = str.toCharArray();
        for (int i = 0; i <ch.length; i++) {
            for (int j = i + 1; j <ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("The duplicate strings are " + ch[j]);
                    count++;
                    break;
                }
            }
        }
       System.out.println("the duplicate string count is " + count);
    }
}

