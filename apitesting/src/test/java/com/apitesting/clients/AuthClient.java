package com.apitesting.clients;

import com.apitesting.data.models.Customer;
import io.restassured.response.Response;
import static com.apitesting.support.spec.request.RequestSpec.requestSpec;
import static io.restassured.RestAssured.given;
public class AuthClient {
    public Response getLogin(Customer customer){
        return given()
                .spec(requestSpec())
                .body(customer)
                .when()
                .post("/auth/login");
    }
}
