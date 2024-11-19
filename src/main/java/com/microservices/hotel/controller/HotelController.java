package com.microservices.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.hotel.entities.Hotel;
import com.microservices.hotel.exception.NoRecordFoundException;
import com.microservices.hotel.services.HotelService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    //create the user
    @PostMapping("/create")
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel) {
        Hotel savedHotel = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getMethodName(@PathVariable String hotelId) throws NoRecordFoundException {
        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.FOUND).body(hotel);
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getUsers() {
        List<Hotel> hotels = hotelService.getHotels();
        return ResponseEntity.status(HttpStatus.FOUND).body(hotels);
    }

    @PutMapping()
    public ResponseEntity<Hotel> putMethodName(@RequestBody Hotel hotel) {
        Hotel updated = hotelService.updaHotel(hotel);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{uuId}")
    public ResponseEntity<Hotel> putMethodName(@PathVariable String uuId) throws NoRecordFoundException {
        Hotel deleted = hotelService.deleteHotel(uuId);
        return ResponseEntity.ok(deleted);
    }
}
