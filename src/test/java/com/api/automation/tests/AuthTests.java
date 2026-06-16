package com.api.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.automation.base.BaseTest;
import com.api.automation.utils.TokenManager;

public class AuthTests extends BaseTest {

    @Test
    public void loginTokenTest() {
        String token = TokenManager.getToken();

        Assert.assertNotNull(token);
        Assert.assertFalse(token.isEmpty());
    }
}