package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Courier;

public interface CourierRepo extends JpaRepository<Courier, Integer> {

	
}
