package systemscenarios.ex_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWorld_RA {
    @Test
    public void test_RA() {
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(200).log().all();
    }
}
