package edu.uniandes.veterinary;

import uk.co.jemos.podam.common.PodamIntValue;

public class Person {
	
	private int id;
	private String name;
	@PodamIntValue(minValue = 1000000, maxValue = 9999999)
	private int phone;
	private String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + "]";
	}
}
