package systemscenarios.ex_03_RestAssured_TestNG_Advance.DELETE;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_DELETE_NONBddStyle {
    //  Delete
    // Pre - Req.
    // token, booking id

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_put_non_bdd() {



        String token = "52b89e9e26f74aa";
        String bookingid = "248";

        // Faker lib


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(201);




    }

}
