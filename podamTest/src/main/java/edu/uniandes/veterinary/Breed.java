package edu.uniandes.veterinary;

public class Breed {
	
	private int id;
	private String name;
	private String description;
	
	public Breed(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Breed [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
