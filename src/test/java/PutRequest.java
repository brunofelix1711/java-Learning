import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.junit.Test;

public class PutRequest {

    @Test
    public void sample_put(){

        RestAssured.baseURI="https://reqres.in/";

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","2");
        jsonObject.put("email","janet.weaver@reqres.in");
        jsonObject.put("first_name","Janet");
        jsonObject.put("last_name","Weaver");
        jsonObject.put("avatar","https://reqres.in/img/faces/2-image.jpg");

        RestAssured.given().when().body(jsonObject.toJSONString()).patch("api/users/2").then().statusCode(200);
    }
}
