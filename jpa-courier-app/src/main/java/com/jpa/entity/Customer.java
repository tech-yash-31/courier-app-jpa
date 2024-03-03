package com.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	private int custid;
    private String custName;
    private String custEmail;
    private String custMobilenum;
    private String custAdd;

    @OneToMany(targetEntity = Courier.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cus_coufk", referencedColumnName = "custid")
    private List<Courier> courier;

	public Customer() {
		super();
	}

	public Customer(int custid, String custName, String custEmail, String custMobilenum, String custAdd,
			List<Courier> courier) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMobilenum = custMobilenum;
		this.custAdd = custAdd;
		this.courier = courier;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustMobilenum() {
		return custMobilenum;
	}

	public void setCustMobilenum(String custMobilenum) {
		this.custMobilenum = custMobilenum;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public List<Courier> getCourier() {
		return courier;
	}

	public void setCourier(List<Courier> courier) {
		this.courier = courier;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", custEmail=" + custEmail + ", custMobilenum="
				+ custMobilenum + ", custAdd=" + custAdd + ", courier=" + courier + "]";
	}
}