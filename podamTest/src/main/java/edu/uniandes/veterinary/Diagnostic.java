package edu.uniandes.veterinary;

import java.util.Date;
import java.util.Random;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Diagnostic {
	private int id;
	private Date date;
	private String description;
	private Medication medication;
	private Dicease dicease;
	
	public Diagnostic(int id, Date date, String description, Medication medication, Dicease dicease) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.medication = medication;
		this.dicease = dicease;
	}
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public Medication getMedication() {
		return medication;
	}
	public Dicease getDicease() {
		return dicease;
	}
	public void initMedication() {
		PodamFactory factory = new PodamFactoryImpl();
		Medication medicationTemp = factory.manufacturePojo(Medication.class);
		medicationTemp.setMedicine(dicease.getMedicines().get(new Random().nextInt(dicease.getMedicines().size())));
		medication = medicationTemp;
	}
	@Override
	public String toString() {
		return "Diagnostic [id=" + id + ", date=" + date + ", description=" + description + ", \n\t\tmedication=" + medication
				+ "\t\t dicease=" + dicease + "]";
	}
	
}
