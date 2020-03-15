package com.vroomcar.RideRateCardService.RideRateCardService;

import javax.persistence.Entity;
import javax.persistence.Table;
/*
 * this is ride estimate bean
 */

public class RideEstimate {

	String source;
	String destination;
	Double amount;
	Double distance;
	Double estimatedFare;
	Double discount;
	Integer port;
	public RideEstimate(String source, String destination, Double amount, Double distance, Double estimatedFare,Double discount) {
		super();
		this.source = source;
		this.destination = destination;
		this.amount = amount;
		this.distance = distance;
		this.estimatedFare = estimatedFare;
		this.discount = discount;
		this.port =port;

	}
	
	public Integer getPort() {
		return port;
	}


	public void setPort(Integer port) {
		this.port = port;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	public RideEstimate() {
		super();
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Double getEstimatedFare() {
		return estimatedFare;
	}
	public void setEstimatedFare(Double estimatedFare) {
		this.estimatedFare = estimatedFare;
	}
	@Override
	public String toString() {
		return "RideEstimate [source=" + source + ", destination=" + destination + ", amount=" + amount + ", distance="
				+ distance + ", estimatedFare=" + estimatedFare + "]";
	}
	
	
}
