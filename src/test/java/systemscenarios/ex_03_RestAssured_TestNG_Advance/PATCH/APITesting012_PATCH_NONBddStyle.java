package systemscenarios.ex_03_RestAssured_TestNG_Advance.PATCH;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
public class APITesting012_PATCH_NONBddStyle {
    //  Patch
    // Pre - Req.
    // token, booking id - A

    //    public void get_token(){ }
//    public void get_booking_id(){}
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_Patch(){

        String token = "52b89e9e26f74aa";
        String bookingid = "248";

        String payload  = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();


        response = r.when().log().all().patch();


        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
