package com.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Branch {
	
	@Id
	private int brid;
    private String brName;
    private String brAdd;
    private String brContact;
    
    @OneToMany(targetEntity = DeliveryStatus.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "dels_branfk", referencedColumnName = "brid")
    private List<DeliveryStatus> deliveryStatus;

	public Branch() {
		super();
	}

	public Branch(int brid, String brName, String brAdd, String brContact, List<DeliveryStatus> deliveryStatus) {
		super();
		this.brid = brid;
		this.brName = brName;
		this.brAdd = brAdd;
		this.brContact = brContact;
		this.deliveryStatus = deliveryStatus;
	}

	public int getBrid() {
		return brid;
	}

	public void setBrid(int brid) {
		this.brid = brid;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getBrAdd() {
		return brAdd;
	}

	public void setBrAdd(String brAdd) {
		this.brAdd = brAdd;
	}

	public String getBrContact() {
		return brContact;
	}

	public void setBrContact(String brContact) {
		this.brContact = brContact;
	}

	public List<DeliveryStatus> getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(List<DeliveryStatus> deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "Branch [brid=" + brid + ", brName=" + brName + ", brAdd=" + brAdd + ", brContact=" + brContact
				+ ", deliveryStatus=" + deliveryStatus + "]";
	}
    
}
