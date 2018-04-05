package edu.uniandes.veterinary;

import java.util.Date;

public class Medication {
	private int id;
	private String dosage;
	private Date date;
	private Medicine medicine;
	private Veterinarian veterinarian;
	public Medication(int id, String dosage, Date date, Veterinarian veterinarian) {
		super();
		this.id = id;
		this.dosage = dosage;
		this.date = date;
		this.veterinarian = veterinarian;
	}
	
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public int getId() {
		return id;
	}
	public String getDosage() {
		return dosage;
	}
	public Date getDate() {
		return date;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public Veterinarian getVeterinarian() {
		return veterinarian;
	}

	@Override
	public String toString() {
		return "Medication [id=" + id + ", dosage=" + dosage + ", date=" + date + ",\n\t\t\t medicine=" + medicine
				+ "\t\t\t veterinarian=" + veterinarian + "]\n";
	}
	
	
}
