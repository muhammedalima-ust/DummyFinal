package com.apitesting.data.models;

import java.util.List;

public record BookingRequest(String journeyType,String inventoryId, List<String> seatIds, Boolean refundable, int holdTtlSec) {
}
