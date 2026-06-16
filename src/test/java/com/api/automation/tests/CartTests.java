package com.api.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.automation.base.BaseTest;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class CartTests extends BaseTest {

    @Test
    public void addCartTest() {

        String body = """
                {
                  "userId": 1,
                  "products": [
                    {
                      "id": 144,
                      "quantity": 4
                    },
                    {
                      "id": 98,
                      "quantity": 1
                    }
                  ]
                }
                """;

        Response response =
                given()
                    .header("Content-Type", "application/json")
                    .body(body)
                .when()
                    .post("/carts/add")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getInt("userId"), 1);
    }
}