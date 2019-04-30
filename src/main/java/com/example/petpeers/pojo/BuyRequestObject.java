package com.example.petpeers.pojo;

import java.io.Serializable;

public class BuyRequestObject implements Serializable {
	int petId;
	int userId;
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}
