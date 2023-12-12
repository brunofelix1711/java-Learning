import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class CatPostRequest {

    @Test
    public void check_post(){
        RestAssured.baseURI="https://cat-fact.herokuapp.com/facts/";

        RequestSpecification requestSpecification=RestAssured.given().body("{/}");

        Response response=requestSpecification.request(Method.POST,"/facts");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusLine());


    }

    @Test
    public void update_list(){

        RestAssured.baseURI="https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json";

        RequestSpecification requestSpecification=RestAssured.given().header("Content-Type","application/json").body("{\r\n"+"\"Make_ID\":\"123\",\r\n"+"\"Make_Name\":\"TEST\",\r\n"+"}");

       Response response= requestSpecification.request(Method.PUT,"/MAKE_ID=4877/");

        System.out.println(response.asPrettyString());
    }
}
