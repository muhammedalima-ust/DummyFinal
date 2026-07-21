package com.apitesting.clients;

import io.restassured.response.Response;

import static com.apitesting.support.spec.request.RequestSpec.auth;
import static com.apitesting.support.spec.request.RequestSpec.requestSpec;
import static io.restassured.RestAssured.given;

public class BookingClient {
    public Response getBus(String token,Object body){
        return given()
                .spec(auth(token))
                .body(body)
                .when()
                .post("/bookings");
    }
}