package edu.uniandes.veterinary;

import java.util.List;

import uk.co.jemos.podam.common.PodamCollection;

public class Dicease {
	private int id;
	private String name;
	private String symptom;
	@PodamCollection (nbrElements = 2)
	private List<Medicine> medicines;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public List<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
	@Override
	public String toString() {
		return "Dicease [id=" + id + ", name=" + name + ", symptom=" + symptom + ", \n\t\tmedicines=" + medicines + "\n]";
	}
	
	

}
