package edu.uniandes.veterinary;

import java.util.List;

import uk.co.jemos.podam.common.PodamStrategyValue;

public class Pet {
	
	private int id;
	private String name;
	private int age;
	@PodamStrategyValue(ColorProvider.class)
	private String color;
	private Person owner;
	private Breed breed;
	private List<Diagnostic> diagnostics;
	
	public Pet(int id, String name, int age, String color, Person owner, Breed breed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.breed = breed;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Person getOwner() {
		return owner;
	}

	public Breed getBreed() {
		return breed;
	}

	public List<Diagnostic> getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(List<Diagnostic> diagnostics) {
		this.diagnostics = diagnostics;
	}
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", color=" + color + ",\n owner=" + owner
				+ ",\n breed=" + breed + ",\n diagnostics=" + diagnostics + "]";
	}	
}
