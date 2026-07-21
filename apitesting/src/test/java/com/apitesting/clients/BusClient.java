package com.apitesting.clients;

import com.apitesting.data.models.Customer;
import io.restassured.response.Response;

import static com.apitesting.support.spec.request.RequestSpec.requestSpec;
import static io.restassured.RestAssured.given;

public class BusClient {
    public Response getBus(){
        return given()
                .spec(requestSpec())
                .when()
                .get("/buses");
    }
}
