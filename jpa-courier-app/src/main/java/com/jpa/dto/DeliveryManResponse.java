package com.jpa.dto;

public class DeliveryManResponse {

	private int did;
	private int orders;
	private String darea;
	private int id;
	
	public DeliveryManResponse() {
		super();
	}

	public DeliveryManResponse(int did, int orders, String darea, int id) {
		super();
		this.did = did;
		this.orders = orders;
		this.darea = darea;
		this.id = id;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	public String getDarea() {
		return darea;
	}

	public void setDarea(String darea) {
		this.darea = darea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DeliveryManResponse [did=" + did + ", orders=" + orders + ", darea=" + darea + ", id=" + id + "]";
	}
}