package systemscenarios.ex_02_RestAssured_Basics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAssured_Project1 {
    @Test
    public void test_Positive_tc1_valid(){
        String pincode = "560037";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }

    @Test
    public void test_Negative_tc1_blank(){
        String pincode = " ";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc2_special_characters(){
        String pincode = "!#%&*(%$";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc3_characters(){
        String pincode = "pincode";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc4_numericalpha(){
        String pincode = "123pin";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc5_space(){
        String pincode = " 560029";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc6_alphanumericsplchar(){
        String pincode = "abc123#";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc7_alphanumeric(){
        String pincode = "pin678";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc8_invalid_pincode(){
        String pincode = "560070560070";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc9_minus(){
        String pincode = "-560033";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
    @Test
    public void test_Negative_tc10_zeros(){
        String pincode = "000000";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
}
