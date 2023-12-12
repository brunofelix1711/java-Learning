import io.restassured.RestAssured;
import org.junit.Test;

public class BDDget {

    @Test
    public void run_bdd(){


        RestAssured.given().baseUri("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json").when().get("MAKE_ID=4877").prettyPrint();

    }

    @Test
    public void post_bdd(){
        RestAssured.given().baseUri("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json").header("Content-Type","application/json").body("{\r\n"+"\"Make_ID\":\"123\",\r\n"+"\"Make_Name\":\"TEST\",\r\n"+"}").when().post().prettyPrint();
    }

    @Test
    public void delete_bdd(){
        RestAssured.given().baseUri("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json").header("Content-Type","application/json").body("{\r\n"+"\"Make_ID\":\"123\",\r\n"+"\"Make_Name\":\"TEST\",\r\n"+"}").when().delete().prettyPrint();
    }
}
