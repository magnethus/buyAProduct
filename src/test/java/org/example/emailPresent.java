package org.example;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class emailPresent {

    @Test
    public void EmailPresent(){

        given().
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(200).
        and().
                body("data.email[0]",equalTo("michael.lawson@reqres.in"));



    }
}
