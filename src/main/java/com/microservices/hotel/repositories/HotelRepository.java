package com.microservices.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
