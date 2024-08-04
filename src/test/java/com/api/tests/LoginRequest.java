package com.api.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginRequest {
    @Test
    public void verifyLoginSuccess(){
        Map<String, String> payload = new HashMap<>();
        payload.put("email", "eve.holt@reqres.in");
        payload.put("password","cityslicka");
        System.out.println(payload);

        JSONObject body = new JSONObject();
        body.put("email", "eve.holt@reqres.in");
        body.put("password","cityslicka");
        System.out.println(body);

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(body.toString())

                        .when()
                        .post("https://reqres.in/api/login");

        String loginResponse =  response.getBody().asPrettyString();
        System.out.println(loginResponse);

        String tokenValue = response
                .then()
                .extract()
                .path("token")
                .toString();

        System.out.println("tokenValue :: " + tokenValue);


    }
}
