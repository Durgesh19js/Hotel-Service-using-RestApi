package com.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.entity.Hotel;
import com.api.repository.HotelRepository;
import com.api.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	private HotelRepository hotelRepository;

	public HotelServiceImpl(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel add(Hotel hotel) {
		hotel.setId(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel update(Hotel hotel) {
		Optional<Hotel> h = hotelRepository.findById(hotel.getId());
		if(h.isEmpty()) {
			return null;
		}
		else {
			return hotelRepository.save(hotel);
		}
	}

	@Override
	public String deleteById(String id) {
		Optional<Hotel> h = hotelRepository.findById(id);
		if(h.isEmpty()) {
			return "Hotel not found with id : "+id;
		}
		else {
			hotelRepository.deleteById(id);
			return "Hotel Deleted with id: "+id;			
		}
	}

	@Override
	public Hotel getById(String id) {
		Optional<Hotel> h = hotelRepository.findById(id);
		if(h.isEmpty()) {
			return null;
		}
		else {
			return h.get();
		}
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

}
