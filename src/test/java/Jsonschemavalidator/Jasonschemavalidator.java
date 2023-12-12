package Jsonschemavalidator;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Test;

import java.io.File;

public class Jasonschemavalidator {

    @Test
    public void schema_validator(){


        File inputjson=new File("src/test/resources/input.json");

        RestAssured.given().baseUri("https://www.w3schools.com/whatis/whatis_json.asp")
                .header("content-type","application/json")
                .body(inputjson)
                .when()
                .post("employee/json")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.josn"));
    }

}
