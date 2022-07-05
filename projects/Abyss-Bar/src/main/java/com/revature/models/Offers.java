package com.revature.models;

public class Offers {

	private int id;
	private int cost;
	private String offerStatus;
	private String currentOffer;
	private String status = "Pending";
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		id = this.id;
	}
	
	public String getStatus() {
		return offerStatus;
	}
	
	public void setStatus() {
		offerStatus = this.offerStatus;
	}
	
	public String getCurrentOffer() {
		return currentOffer;
	}
	
	public void setOffer() {
		currentOffer = this.currentOffer;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost() {
		cost = this.cost;
	}

	
	
}
