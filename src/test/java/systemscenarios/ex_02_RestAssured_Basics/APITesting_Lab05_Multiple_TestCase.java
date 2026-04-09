package systemscenarios.ex_02_RestAssured_Basics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab05_Multiple_TestCase {
    @Test
    public void test_Positive_tc1(){
        String pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void test_Negative_tc1(){
        String pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void test_Negative_tc2(){
        String pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
