package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeliveryStatus {
	
	@Id
	private int delsid;
	private String delmanname;
    private String status;
    private String description;
	
    public DeliveryStatus() {
		super();
	}

	public DeliveryStatus(int delsid, String delmanname, String status, String description) {
		super();
		this.delsid = delsid;
		this.delmanname = delmanname;
		this.status = status;
		this.description = description;
	}

	public int getDelsid() {
		return delsid;
	}

	public void setDelsid(int delsid) {
		this.delsid = delsid;
	}

	public String getDelmanname() {
		return delmanname;
	}

	public void setDelmanname(String delmanname) {
		this.delmanname = delmanname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DeliveryStatus [delsid=" + delsid + ", delmanname=" + delmanname + ", status=" + status
				+ ", description=" + description + "]";
	}
}
