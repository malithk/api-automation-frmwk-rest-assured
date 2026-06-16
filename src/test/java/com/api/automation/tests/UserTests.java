package com.api.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.automation.base.BaseTest;
import com.api.automation.utils.TokenManager;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class UserTests extends BaseTest {

    @Test
    public void getUserTest() {

        Response response =
                given()
                    .header("Authorization", "Bearer " + TokenManager.getToken())
                .when()
                    .get("/auth/me")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.jsonPath().getString("username"));
    }
}