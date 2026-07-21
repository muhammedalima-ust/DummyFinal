package com.apitesting.data.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Bus(String id, String operator, String origin, String dest, int baseFarePaise, int seatsLeft){
}
