package com.revature.daos;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementDao {
	
	Reimbursement insertReimbursement(Reimbursement reimb);
	
	Reimbursement createReimbursement(Reimbursement reimb);
	
	Reimbursement getReimbursementById(int id);
	
	Reimbursement updateReimbursement(int id, String status, int reimbResolverId);
	
	List<Reimbursement> getReimbursements();
	
	List<Reimbursement> getPendingReimbursements(int Id);
	
	List<Reimbursement> getResolvedReimbursements(int Id);


	
	
	
	
	
	
	
	
	
	
}
