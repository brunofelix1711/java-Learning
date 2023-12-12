import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

    public static void main(String[] args) {

        Response response= RestAssured.get("https://web.whatsapp.com/");

       int statuscode= response.getStatusCode();
       String statusline=response.getStatusLine();

       System.out.println(statuscode);
        System.out.println(statusline);

    }
}
