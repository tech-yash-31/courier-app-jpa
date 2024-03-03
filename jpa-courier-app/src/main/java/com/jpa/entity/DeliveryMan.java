package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeliveryMan {
	
	@Id
	private int did;
	private String darea;
	private int orders;
	
	public DeliveryMan() {
		super();
	}

	public DeliveryMan(int did, String darea, int orders) {
		super();
		this.did = did;
		this.darea = darea;
		this.orders = orders;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDarea() {
		return darea;
	}

	public void setDarea(String darea) {
		this.darea = darea;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "DeliveryMan [did=" + did + ", darea=" + darea + ", orders=" + orders + "]";
	}
}
