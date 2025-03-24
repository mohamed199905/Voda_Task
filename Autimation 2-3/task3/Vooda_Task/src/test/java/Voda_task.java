import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Voda_task {


    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://api.agify.io";
    }


    @Test
    public void testPredictAgeByName() {
        given()
                .log().all()
                .queryParam("name", "meelad")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200)
                .body("age", notNullValue());
    }

    @Test

    public void testCommonName() {
        given()
                .queryParam("name", "john")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("age", greaterThan(0));
    }

    @Test

    public void testRareName() {
        given()
                .queryParam("name", "xaxaxsasas")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("age",nullValue());
    }
    @Test

    public void testMissingName() {
        given()
                .queryParam("name", "")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("age",nullValue());
    }
    }
