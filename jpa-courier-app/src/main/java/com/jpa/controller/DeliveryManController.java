package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.DeliveryManResponse;
import com.jpa.entity.DeliveryMan;
import com.jpa.repo.DeliveryManRepo;

@RestController
public class DeliveryManController {
	
	@Autowired
	private DeliveryManRepo deliveryManRepo;
	
	@PostMapping("/delivaryman")
	public DeliveryMan addMan(@RequestBody DeliveryMan man) {
		return deliveryManRepo.save(man);
	}
	
//	@GetMapping("/getSpecDelivery")
//	public List<DeliveryManResponse> getJoinInformation(){
//		return deliveryManRepo.getJoinInformation();
//	}
	
}
