package com.api.automation.base;

import org.testng.annotations.BeforeClass;

import com.api.automation.utils.ConfigReader;

import io.restassured.RestAssured;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("base_url");
    }
}