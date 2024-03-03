package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.dto.BranchResponse;
import com.jpa.entity.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer> {

	@Query("SELECT new com.jpa.dto.BranchResponse(b.brid, b.brName, d.delsid, d.delmanname, d.status) From Branch b JOIN b.deliveryStatus d")
	public List<BranchResponse> getJoinInformation();
}
