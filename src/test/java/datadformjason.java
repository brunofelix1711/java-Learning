import io.restassured.RestAssured;
import org.junit.Test;

import java.io.File;

public class datadformjason {

    @Test
    public void get_data_json(){
        File file=new File("src/test/java/Postdata.json");

        RestAssured.given().baseUri("http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/today").header("Content-Type","application/json").body(file).when().post("").prettyPrint();

    }
}
