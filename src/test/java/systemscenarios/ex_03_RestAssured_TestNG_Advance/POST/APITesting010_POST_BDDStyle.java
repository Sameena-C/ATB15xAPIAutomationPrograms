package systemscenarios.ex_03_RestAssured_TestNG_Advance.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting010_POST_BDDStyle {

    @Test
    public void test_POST_AUTH_TOKEN(){
        String base_url = "https://restful-booker.herokuapp.com";
        String path_url = "/auth";
        String payload  = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri(base_url)
                .basePath(path_url)
                .contentType(ContentType.JSON).log().all()
                .body(payload)
                .when().post()
                .then().log().all().statusCode(200);

    }

}
