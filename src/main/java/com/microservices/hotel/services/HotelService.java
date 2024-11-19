package com.microservices.hotel.services;

import java.util.List;

import com.microservices.hotel.entities.Hotel;
import com.microservices.hotel.exception.NoRecordFoundException;

public interface HotelService {
    //crate

    Hotel createHotel(Hotel hotel);

    //update
    Hotel updaHotel(Hotel hotel);

    //read
    Hotel getHotel(String id) throws NoRecordFoundException;

    // read all
    List<Hotel> getHotels();

    //delete
    Hotel deleteHotel(String id) throws NoRecordFoundException;
}
