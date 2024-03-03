package com.jpa.dto;

import com.jpa.entity.DeliveryMan;

public class DeliveryManRequest {
	
	private DeliveryMan man;

	public DeliveryManRequest() {
		super();
	}

	public DeliveryManRequest(DeliveryMan man) {
		super();
		this.man = man;
	}

	public DeliveryMan getMan() {
		return man;
	}

	public void setMan(DeliveryMan man) {
		this.man = man;
	}

	@Override
	public String toString() {
		return "DeliveryManRequest [man=" + man + "]";
	}
}