package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.entity.DeliveryMan;

public interface DeliveryManRepo extends JpaRepository<DeliveryMan, Integer> {
	
	@Query("SELECT new com.jpa.dto.DeliveryManResponse(d.did, d.darea, d.orders, c.id) FROM DeliveryMan d JOIN d.deliveryMan c")
	public List<DeliveryMan> getJoinInformation();
}
