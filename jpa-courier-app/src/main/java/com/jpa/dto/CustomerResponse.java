package com.jpa.dto;

public class CustomerResponse {

	private int custid;
    private String custName;
    private String custMobilenum;
    private String custAdd;
    private int id;
    
	public CustomerResponse() {
		super();

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerResponse(int custid, String custName, String custMobilenum, String custAdd, int id) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custMobilenum = custMobilenum;
		this.custAdd = custAdd;
		this.id = id;
	}

	@Override
	public String toString() {
		return "CustomerResponse [custid=" + custid + ", custName=" + custName + ", custMobilenum=" + custMobilenum
				+ ", custAdd=" + custAdd + ", id=" + id + "]";
	}

}
