package com.api.automation.utils;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class TokenManager {

    private static String token;

    public static String getToken() {

        if (token == null) {

            String body = "{\n" +
                    "  \"username\": \"" + ConfigReader.getProperty("username") + "\",\n" +
                    "  \"password\": \"" + ConfigReader.getProperty("password") + "\",\n" +
                    "  \"expiresInMins\": 30\n" +
                    "}";

            Response response =
                    given()
                        .header("Content-Type", "application/json")
                        .body(body)
                    .when()
                        .post("/auth/login")
                    .then()
                        .extract()
                        .response();

            token = response.jsonPath().getString("accessToken");
        }

        return token;
    }
}