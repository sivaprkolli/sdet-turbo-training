package com.api.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class GetUserDetails {

    /**
     * Given - payload, parameters , headers
     * When - method and endpoint
     * Then - assertion/verification
     */

    @Test
    public void getUserData() {

        Response response =
                when()
                        .get("https://simple-grocery-store-api.glitch.me/status");

        String resp = response
                .then()
                .extract()
                .path("status");

        System.out.println(resp.toString());
        Assert.assertEquals(resp.toString(), "UP");
    }
}
