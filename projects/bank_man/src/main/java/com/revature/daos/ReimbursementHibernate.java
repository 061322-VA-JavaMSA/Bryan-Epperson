package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.revature.models.Reimbursement;
import com.revature.util.HibernateUtil;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class ReimbursementHibernate implements ReimbursementDao {
	
	@Override
	public Reimbursement insertReimbursement(Reimbursement reimb) {
		reimb.setId(-1);
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = s.beginTransaction();
			int id = (int) s.save(reimb);
			reimb.setId(id);
			tx.commit();	
		} catch(ConstraintViolationException e) {
			//log it
		}
		return reimb;
		
	}
	
	
	@Override
    public Reimbursement createReimbursement(Reimbursement reimb) {
        reimb.setId(-1);
        try(Session s = HibernateUtil.getSessionFactory().openSession()){
            Transaction tx = s.beginTransaction();
            int id = (int) s.save(reimb);
            reimb.setId(id);
            tx.commit();
        } catch(ConstraintViolationException e) {
            //log it
        }
        return reimb;
    }
	
	@Override
	public Reimbursement getReimbursementById(int id) {
		Reimbursement reimbursement = null;
		try(Session s = HibernateUtil.getSessionFactory().openSession();){
			
			
			reimbursement = s.get(Reimbursement.class, id);
		}
		
		return reimbursement;
		
	}
	
	@Override
	public List<Reimbursement> getPendingReimbursements(int id){
		List<Reimbursement> reimbursement = null;
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			reimbursement = s.createQuery("from Reimbursement", Reimbursement.class).list();
		}
		
		return reimbursement;
	}

	@Override
	public Reimbursement updateReimbursement(int id, String status, int reimbResolverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursements() {
		List<Reimbursement> reimbursement = null;
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			reimbursement = s.createQuery("from Reimbursement", Reimbursement.class).list();
		}
		
		return reimbursement;
		
	}

	@Override
	public List<Reimbursement> getResolvedReimbursements(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
