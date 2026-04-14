package systemscenarios.ex_03_RestAssured_TestNG_Advance.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_NONBDD_STYLE {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void test_GET_NON_BDD_STYLE(){

        pincode = "560049";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);

    }

    @Test
    public void test_GET_NON_BDD_STYLE_NEGAGIVE(){

        pincode = "@";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(404);

    }
}
