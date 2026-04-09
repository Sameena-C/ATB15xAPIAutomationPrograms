package systemscenarios.ex_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWorld {
    @Test
    public void testHelloWorld(){

        //Rest Assured
        //Given
        //When
        //Then
        RestAssured
                // Step 1- re- Req
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                // Step 2- Action
                .when()
                .get()
                // Step 3- Validation
                .then()
                .statusCode(200);


    }
}
