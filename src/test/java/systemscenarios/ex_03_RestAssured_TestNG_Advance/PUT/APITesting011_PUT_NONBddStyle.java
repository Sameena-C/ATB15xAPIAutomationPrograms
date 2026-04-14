package systemscenarios.ex_03_RestAssured_TestNG_Advance.PUT;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_PUT_NONBddStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    //  PUT
    // Pre - Req.
    // token, booking id - A

    @Test
    public void test_non_bdd_put() {
        String token = "52b89e9e26f74aa";
        String bookingid = "248";

        //    public void get_token(){ }
//    public void get_booking_id(){}

        String payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();


        response = r.when().log().all().put();


        vr = response.then().log().all();
        vr.statusCode(200);
    }
}