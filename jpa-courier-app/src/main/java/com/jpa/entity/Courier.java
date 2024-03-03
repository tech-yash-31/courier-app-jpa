package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courier {

	@Id
	private int id;
    private int trackingNum;
    private int courierWeight;
    private String courierType;

    
	public Courier() {
		super();
	}

	public Courier(int id, int trackingNum, int courierWeight, String courierType) {
		super();
		this.id = id;
		this.trackingNum = trackingNum;
		this.courierWeight = courierWeight;
		this.courierType = courierType;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrackingNum() {
		return trackingNum;
	}

	public void setTrackingNum(int trackingNum) {
		this.trackingNum = trackingNum;
	}

	public int getCourierWeight() {
		return courierWeight;
	}

	public void setCourierWeight(int courierWeight) {
		this.courierWeight = courierWeight;
	}

	public String getCourierType() {
		return courierType;
	}

	public void setCourierType(String courierType) {
		this.courierType = courierType;
	}

	@Override
	public String toString() {
		return "Courier [id=" + id + ", trackingNum=" + trackingNum + ", courierWeight=" + courierWeight
				+ ", courierType=" + courierType + "]";
	}
}
