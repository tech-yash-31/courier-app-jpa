package com.jpa.dto;

public class BranchResponse {

	private int brid;
    private String brName;
	private int delsid;
	private String delmanname;
    private String status;
    
	public BranchResponse() {
		super();
	}

	public BranchResponse(int brid, String brName, int delsid, String delmanname, String status) {
		super();
		this.brid = brid;
		this.brName = brName;
		this.delsid = delsid;
		this.delmanname = delmanname;
		this.status = status;
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

	@Override
	public String toString() {
		return "BranchResponse [brid=" + brid + ", brName=" + brName + ", delsid=" + delsid + ", delmanname="
				+ delmanname + ", status=" + status + "]";
	}
}
