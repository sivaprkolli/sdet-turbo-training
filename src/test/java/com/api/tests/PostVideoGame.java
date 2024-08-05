package com.api.tests;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class PostVideoGame {

    @Test
    public void postAGame() throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password","admin");

        Response tokenResponse =
                given()
                        .header("content-type","application/json")
                        .body(jsonObject.toString())
                        .when()
                        .post("https://videogamedb.uk/api/authenticate");

        String bearer_token = tokenResponse
                .then()
                .extract()
                .path("token").toString();

        System.out.println(bearer_token);

        byte[] bytes;
        File file = new File( System.getProperty("user.dir")+"/gameDetails.json");
        bytes = Files.readAllBytes(file.toPath());

        System.out.println(bytes.toString());

        Response postAGame =
                given()
                        .header("content-type","application/json")
                        .header("Authorization", "Bearer " +bearer_token)
                        .body(bytes)
                        .when()
                        .post("https://videogamedb.uk/api/videogame");

        String newGameResponse =
                postAGame
                        .then()
                        .extract()
                        .path("category").toString();

        System.out.println(newGameResponse);
        Assert.assertEquals(newGameResponse, "Action");
    }
}
