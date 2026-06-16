package com.api.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.automation.base.BaseTest;
import com.api.automation.utils.TokenManager;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ProductTests extends BaseTest {

    @Test
    public void getAllProductsTest() {

        Response response =
                given()
                    .header("Authorization", "Bearer " + TokenManager.getToken())
                .when()
                    .get("/products")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("products").size() > 0);
    }

    @Test
    public void getSingleProductTest() {

        Response response =
                given()
                    .header("Authorization", "Bearer " + TokenManager.getToken())
                .when()
                    .get("/product/2")
                .then()
                    .extract()
                    .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 2);
    }
}