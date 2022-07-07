package com.revature.models;

import java.util.Objects;

public class Offers {

	private int id;
	private int cost;
	private String currentCustomer;
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
	
	public String getCustomer() {
		return currentCustomer;
	}
	
	public void setCustomer(String currentCustomer) {
		currentCustomer = this.currentCustomer;
	}
	public void setStatus(String offerStatus) {
		offerStatus = this.offerStatus;
	}
	
	public String getOffer() {
		return currentOffer;
	}
	
	public void setOffer(String currentOffer) {
		currentOffer = this.currentOffer;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		cost = this.cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, currentOffer, id, offerStatus, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offers other = (Offers) obj;
		return cost == other.cost && Objects.equals(currentOffer, other.currentOffer) && id == other.id
				&& Objects.equals(offerStatus, other.offerStatus) && Objects.equals(status, other.status);
	}


	
	
}
