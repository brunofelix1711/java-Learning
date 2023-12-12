import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Test;

public class CatfactsGetrequest {

    @Test
    public void getcatlist() {
        Response response = RestAssured.get("https://api.publicapis.org/entries");

        ResponseBody body_content = response.getBody();

        System.out.println(body_content.asPrettyString());
    }

    @Test
    public void method_chaining() {
        RestAssured.baseURI="https://api.coindesk.com/v1/bpi/currentprice.json";
       Response response= RestAssured.given().param("","").header("","").when().get();
       System.out.println(response.asPrettyString());


    }

}

