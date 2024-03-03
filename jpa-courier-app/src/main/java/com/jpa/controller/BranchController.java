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

import com.jpa.dto.BranchRequest;
import com.jpa.dto.BranchResponse;
import com.jpa.entity.Branch;
import com.jpa.entity.DeliveryStatus;
import com.jpa.repo.BranchRepo;
import com.jpa.repo.DeliveryStatusRepo;

@RestController
public class BranchController {

	@Autowired
	private BranchRepo branchRepo;
	
	@Autowired
	private DeliveryStatusRepo deliveryStatusRepo;
	
	@PostMapping("/placeBranch")
	public Branch placeBranch(@RequestBody BranchRequest branchRequest) {
		return branchRepo.save(branchRequest.getBranch());
	}
	
	@GetMapping("/findAllBranchs")
	public List<Branch> findAllBranchs(){
		return branchRepo.findAll();
	}
	
	@GetMapping("/getSpecInfo")
	public List<BranchResponse> getJoinInformation(){
		return branchRepo.getJoinInformation();
	}
	
	@PostMapping("/branch")
	public Branch addBranch(@RequestBody Branch branch) {
		return branchRepo.save(branch);
	}
	
	@GetMapping("/branch/{brid}")
	public Branch displayBranchByBrid(@PathVariable("brid") int brid) {
		return branchRepo.findById(brid).get();
	}
	
	@DeleteMapping("/branch/{brid}")
	public String deleteBranchByBrid(@PathVariable("brid") int brid) {
		branchRepo.deleteById(brid);
		return "Branch deleted Successfully..";
	}
	
	//Delivery Status Controlls
	@PostMapping("/deliveryStatus")
	public DeliveryStatus addDelivery(@RequestBody DeliveryStatus deliveryStatus) {
		return deliveryStatusRepo.save(deliveryStatus);
	}
	
	@DeleteMapping("/deliveryStatus/{delsid}")
	public String deleteDeliveryByDelsid(@PathVariable("delsid") int delsid) {
		deliveryStatusRepo.deleteById(delsid);
		return "Delivery deleted Successfully..";
	}
	
	@PutMapping("/deliveryStatus/{delsid}")
	public DeliveryStatus updateDeliveryStatusByDelsid(
			@PathVariable("delsid") int delsid,
			@RequestBody DeliveryStatus deliveryStatus) 
	{
		DeliveryStatus d= deliveryStatusRepo.findById(delsid).get();
		d.setStatus(deliveryStatus.getStatus());
		d.setDescription(deliveryStatus.getDescription());
		deliveryStatusRepo.save(d);
		return d;
	}
}
