package Jsonschemavalidator;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class HamcrestMatchervalidation {

    @Test
    public void validate() throws IOException {

        File jasonfile=new File("src/test/resources/input.json");

        String jasoncontent=FileUtils.readFileToString(jasonfile,"UTF-8");

        File schemafile=new File("src/test/resources/Schema.json");

        MatcherAssert.assertThat(jasoncontent, JsonSchemaValidator.matchesJsonSchemaInClasspath(String.valueOf(schemafile)));
    }
}
