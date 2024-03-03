package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.CustomerRequest;
import com.jpa.dto.CustomerResponse;
import com.jpa.entity.Courier;
import com.jpa.entity.Customer;
import com.jpa.repo.CourierRepo;
import com.jpa.repo.CustomerRepo;

@RestController
public class CustomerController {

	@Autowired
	private CourierRepo courierRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
		
	@PostMapping("/placeCustomer")
	public Customer placeCustomer(@RequestBody CustomerRequest request) {
		return customerRepo.save(request.getCustomer());
	}
	 
	@GetMapping("/findAllCustomers")
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<CustomerResponse> getJoinInformation(){
		return  customerRepo.getJoinInformation();
	}

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);
	}
	
	@GetMapping("/customer/{custid}")
	public Customer displayCustomerByCustid(@PathVariable("custid") int custid){
		return customerRepo.findById(custid).get();
		
	}
	
	@DeleteMapping("/customer/{custid}")
	public String deleteCustomerByCustid(@PathVariable("custid") int custid) {
		 customerRepo.deleteById(custid);
		 return "User deleted Successfully..";
	}
	
	//Courier Controlls
	@PostMapping("/courier")
	public Courier addCourier(@RequestBody Courier courier) {
		return courierRepo.save(courier);
	}
	
	@GetMapping("/courier/{id}")
	public Courier displayCourierByid(@PathVariable("id") int id){
		return courierRepo.findById(id).get();
		
	}
	
	@PutMapping("/courier/{id}")
	public Courier updateCourier(
			@PathVariable("id") int id,
			@RequestBody Courier courier) 
	{
		Courier c= courierRepo.findById(id).get();
		c.setCourierType(courier.getCourierType());
		c.setCourierWeight(courier.getCourierWeight());
		courierRepo.save(c);
		return c;
	}
	
	@DeleteMapping("/courier/{id}")
	public String deleteCourierByid(@PathVariable("id") int id) {
		courierRepo.deleteById(id);
		 return "Courier deleted Successfully..";
	}
}
