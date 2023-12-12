import io.restassured.RestAssured;

import org.json.simple.JSONObject;
import org.junit.Test;

public class PostRequest {

    @Test
    public void sample_post()  {

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","test");
        jsonObject.put("salary","123");
        jsonObject.put(	"age","23");

        System.out.println(jsonObject.toString());

        //https://reqres.in/api/users

        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/create";

        RestAssured.given().header("","").body(jsonObject.toJSONString()).post().then().statusCode(201);


    }
}
