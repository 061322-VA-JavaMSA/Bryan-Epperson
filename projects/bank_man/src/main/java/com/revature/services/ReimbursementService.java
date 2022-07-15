package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbursementDao;
import com.revature.daos.ReimbursementHibernate;
import com.revature.exceptions.ReimbursementNotCreatedException;
import com.revature.exceptions.ReimbursementNotFound;
import com.revature.models.Reimbursement;

public class ReimbursementService {

private ReimbursementDao rd = new ReimbursementHibernate();
	
	public List<Reimbursement> getReimbursements() {
		return rd.getReimbursements();
	}
	
	public Reimbursement getReimbursementById(int id){
		Reimbursement reimb = rd.getReimbursementById(id);
		if (reimb == null) {
		}
		return reimb;
	}	
	public Reimbursement createReimbursement(Reimbursement reimb){

        Reimbursement createdReimbursement = rd.insertReimbursement(reimb);
        if(createdReimbursement.getId() == -1) {
            
        }
        return createdReimbursement;
    }
}