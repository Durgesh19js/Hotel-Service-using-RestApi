package com.api.service;

import java.util.List;

import com.api.entity.Hotel;

public interface HotelService {

	Hotel add(Hotel hotel);
	Hotel update(Hotel hotel);
	String deleteById(String id);
	Hotel getById(String id);
	List<Hotel> getAll();
}
