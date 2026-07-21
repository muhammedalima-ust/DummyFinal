package com.apitesting.tests;

import com.apitesting.clients.AuthClient;
import com.apitesting.data.builder.CustomerBuilder;
import com.apitesting.data.models.AuthResponse;
import com.apitesting.data.models.Customer;
import com.apitesting.data.testDatas.TestUser;
import com.apitesting.support.spec.response.ResponseSpec;
import com.apitesting.support.utils.ExtentTestListener;
import com.apitesting.support.utils.Log;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Feature("AUTHENTICATION TEST")
public class AuthTest extends BaseTest{


    protected static Log log;



    @Test
    @DisplayName("Check whether user token is generated correctly and the responseJson also")
    void TestLogin(){
        log.step("Test to check the Login Started");
        Customer customer1 = new CustomerBuilder().named(TestUser.getUserName1()).build();

        AuthResponse authResponse = authClient
                                        .getLogin(customer1)
                                        .then()
                                        .spec(ResponseSpec.okjson())
                                        .extract()
                                        .as(AuthResponse.class);

        assertNotNull(authResponse.token());

        log.step("API Response and Status Code Verified");
    }
}
