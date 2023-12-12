import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


public class MicrosoftGetrequest {

    @Test
    public void bill_gates_get(){

        RestAssured.baseURI="https://cat-fact.herokuapp.com/facts/";

        RequestSpecification requestSpecification=RestAssured.given();

        Response response=requestSpecification.request(Method.GET,"facts");

        System.out.println(response.asPrettyString());

        System.out.println(response.getStatusLine());


    }
}
