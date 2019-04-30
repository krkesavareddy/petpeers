package com.example.petpeers.pojo;

import java.io.Serializable;

import com.example.petpeers.entity.User;

public class PetDto implements Serializable{
	
	private long PetId;
	private String name;
	private String place;
	private int age;
	public long getPetId() {
		return PetId;
	}
	public void setPetId(long petId) {
		PetId = petId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
