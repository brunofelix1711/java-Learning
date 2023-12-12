import io.restassured.RestAssured;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Serialization {

    @Test
    public void addthedata(){

        Map<String,Object> leo=new HashMap<String,Object>();

        leo.put("name","felix");
        leo.put( "job", "leader");




//        List<String> skills=new ArrayList<String>();
//        skills.add("java");
//        skills.add("python");
//
//        leo.put("skills",skills);

        System.out.println(leo);

        RestAssured.given().baseUri("https://reqres.in/api/users")
                .header("Content-Type","application/json").body(leo).log().all().when().post("api/users");
    }
}
