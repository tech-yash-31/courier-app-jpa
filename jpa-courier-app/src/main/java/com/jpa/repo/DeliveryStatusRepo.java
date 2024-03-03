package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.DeliveryStatus;

public interface DeliveryStatusRepo extends JpaRepository<DeliveryStatus, Integer> {

}
