package com.microservices.hotel.services.servicesImlp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.hotel.entities.Hotel;
import com.microservices.hotel.exception.NoRecordFoundException;
import com.microservices.hotel.repositories.HotelRepository;
import com.microservices.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updaHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String id) throws NoRecordFoundException {
        return hotelRepository.findById(id).orElseThrow(() -> new NoRecordFoundException());
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel deleteHotel(String id) throws NoRecordFoundException {
        Hotel hotel = hotelRepository.findById(id).orElseThrow(() -> new NoRecordFoundException());
        hotelRepository.delete(hotel);
        return hotel;
    }

}
