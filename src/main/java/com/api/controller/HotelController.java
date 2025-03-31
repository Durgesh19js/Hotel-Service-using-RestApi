package com.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Hotel;
import com.api.service.HotelService;

@RestController
@RequestMapping("hotels")
public class HotelController {
	
	private HotelService hotelService;
	
	public HotelController(HotelService hotelService) {
		super();
		this.hotelService = hotelService;
	}


	@PostMapping("/add")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return hotelService.add(hotel);
	}
	
	@GetMapping("/all")
	public List<Hotel> getAllHotels(){
		return hotelService.getAll();
	}
	
	@GetMapping("/delete/{id}")
	public String deleteHotel(@PathVariable("id") String id) {
		return hotelService.deleteById(id);
	}
	
	@PostMapping("/update")
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return hotelService.update(hotel);
	}

}
