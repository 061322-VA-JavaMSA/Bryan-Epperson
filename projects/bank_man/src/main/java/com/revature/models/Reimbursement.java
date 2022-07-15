package com.revature.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reimbursements", schema = "public")
public class Reimbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="reimb_type")
	private String reimbType;
	@Column(name = "reimb_status")
	private String reimbStatus;
	@Column(name = "reimb_desc")
	private String reimbDescription;
	@Column(name = "reimb_amount")
	private String reimbAmount;
	@Column(name = "reimb_author")
	private String reimbAuthor;
	@Column(name = "reimb_recpit")
	private String reimbRecpit;
	@Column(name = "reimb_resolver")
	private String reimbResolver;
	private int userId;
	
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
	public String getReimbStatus() {
		return reimbStatus;
	}
	public void setReimbStatus(String reimbStatus) {
		this.reimbStatus = reimbStatus;
	}
	public String getReimbDescription() {
		return reimbDescription;
	}
	public void setReimbDescription(String reimbDescription) {
		this.reimbDescription = reimbDescription;
	}
	public String getReimbAmount() {
		return reimbAmount;
	}
	public void setReimbAmount(String reimbAmount) {
		this.reimbAmount = reimbAmount;
	}
	public String getReimbAuthor() {
		return reimbAuthor;
	}
	public void setReimbAuthor(String reimbAuthor) {
		this.reimbAuthor = reimbAuthor;
	}
	public String getReimbRecpit() {
		return reimbRecpit;
	}
	public void setReimbRecpit(String reimbRecpit) {
		this.reimbRecpit = reimbRecpit;
	}
	public String getReimbResolver() {
		return reimbResolver;
	}
	public void setReimbResolver(String reimbResolver) {
		this.reimbResolver = reimbResolver;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, reimbAmount, reimbAuthor, reimbDescription, reimbRecpit, reimbResolver, reimbStatus,
				reimbType, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return id == other.id && Objects.equals(reimbAmount, other.reimbAmount)
				&& Objects.equals(reimbAuthor, other.reimbAuthor)
				&& Objects.equals(reimbDescription, other.reimbDescription)
				&& Objects.equals(reimbRecpit, other.reimbRecpit) && Objects.equals(reimbResolver, other.reimbResolver)
				&& Objects.equals(reimbStatus, other.reimbStatus) && Objects.equals(reimbType, other.reimbType)
				&& userId == other.userId;
	}
	
	

	
}
