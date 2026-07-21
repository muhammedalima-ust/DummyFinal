package com.apitesting.tests;

import com.apitesting.clients.BookingClient;
import com.apitesting.data.builder.BookingBuilder;
import com.apitesting.data.models.BookingRequest;
import com.apitesting.support.spec.response.ResponseSpec;
import com.apitesting.support.utils.ExtentTestListener;
import com.apitesting.support.utils.Log;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class BookingTest extends BaseTest {

    @Test
    @DisplayName("Booking Full FLow")
    public void BookingBus(){
        Response busResponse =  busClient.getBus();
        busResponse.then().spec(ResponseSpec.okjson());
    }

    @Test
    @DisplayName("Booking new Bus")
    public void Booker(){
        BookingRequest bookingRequest = new BookingBuilder().build();
        Log.info("response",bookingRequest.toString());
        Response bookingResponse = bookingClient.getBus(token,bookingRequest);
        bookingResponse.then().spec(ResponseSpec.okcreated());
    }
}
