package com.apitesting.tests;

import com.apitesting.clients.AuthClient;
import com.apitesting.clients.BookingClient;
import com.apitesting.clients.BusClient;
import com.apitesting.data.builder.CustomerBuilder;
import com.apitesting.data.models.AuthResponse;
import com.apitesting.data.testDatas.TestUser;
import com.apitesting.support.spec.response.ResponseSpec;
import com.apitesting.support.utils.ExtentTestListener;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

public abstract class BaseTest {
    protected static AuthClient authClient;
    protected static String token;
    protected static BusClient busClient;
    protected static BookingClient bookingClient;
    @BeforeAll
    static void SetUp(){
        authClient = new AuthClient();
        busClient = new BusClient();
        bookingClient = new BookingClient();
        token =
        authClient
                .getLogin(new CustomerBuilder().named(TestUser.getUserName1()).build())
                .then()
                .spec(ResponseSpec.okjson())
                .extract()
                .as(AuthResponse.class).token();
    }
}