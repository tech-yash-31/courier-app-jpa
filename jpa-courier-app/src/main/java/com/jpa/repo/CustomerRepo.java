package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.dto.CustomerResponse;
import com.jpa.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT new com.jpa.dto.CustomerResponse(c.id, c.custName, c.custMobilenum, c.custAdd, cu.id) From Customer c JOIN c.courier cu")
	public List<CustomerResponse> getJoinInformation();

}
