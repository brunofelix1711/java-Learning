package Java;

import java.util.HashMap;

public class CountOfEachcharacterinString {
    public static void main(String[] args) {


        String name="brunofelix";

        String[] split=name.split("");

        HashMap<String,Integer>map=new HashMap<String,Integer>();

        for(int i=0; i<split.length; i++){
            if (map.containsKey(split[i])){
                int count=map.get(split[i]);
                map.put(split[i],count+1 );
            }
            else {
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }

}
