package com.apitesting.data.builder;

import com.apitesting.data.models.BookingRequest;

import java.util.ArrayList;
import java.util.List;

public class BookingBuilder {
    public BookingBuilder(){}
    String journeyType= "bus";
    String inventoryId= "BUS-DELJAI-04";
    List<String> seatIds= new ArrayList<>(List.of("L3"));
    Boolean refundable = true;
    int holdTtlSec =120;

    public BookingBuilder setJourneyType(String journeyType) {
        this.journeyType = journeyType;
        return this;
    }

    public BookingBuilder setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public BookingBuilder setSeatIds(List<String> seatIds) {
        this.seatIds = seatIds;
        return this;
    }

    public BookingBuilder setRefundable(Boolean refundable) {
        this.refundable = refundable;
        return this;
    }

    public BookingBuilder setHoldTtlSec(int holdTtlSec) {
        this.holdTtlSec = holdTtlSec;
        return this;
    }
    
    public BookingRequest build(){
        return  new BookingRequest(this.journeyType,this.inventoryId,this.seatIds,this.refundable,this.holdTtlSec);
    }
}
