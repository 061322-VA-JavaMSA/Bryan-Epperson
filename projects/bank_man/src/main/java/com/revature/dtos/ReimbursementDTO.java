package com.revature.dtos;

import java.util.Objects;


import com.revature.models.Reimbursement;
import com.revature.models.User;
public class ReimbursementDTO {

	private int id;
	private String reimbType;

	public ReimbursementDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReimbursementDTO(Reimbursement reimb) {
		id = reimb.getId();
		reimbType = reimb.getReimbType();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReimbType() {
		return reimbType;
	}

	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, reimbType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbursementDTO other = (ReimbursementDTO) obj;
		return id == other.id && Objects.equals(reimbType, other.reimbType);
	}
	
	
}
