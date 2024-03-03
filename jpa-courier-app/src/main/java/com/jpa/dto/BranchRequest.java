package com.jpa.dto;

import com.jpa.entity.Branch;

public class BranchRequest {
	
	private Branch branch;

	public BranchRequest() {
		super();
	}

	public BranchRequest(Branch branch) {
		super();
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "BranchRequest [branch=" + branch + "]";
	}
}
