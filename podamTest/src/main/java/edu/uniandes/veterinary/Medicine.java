package edu.uniandes.veterinary;

public class Medicine {
	private int id;
	private String name;
	private String indications;
	
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
	public String getIndications() {
		return indications;
	}
	public void setIndications(String indications) {
		this.indications = indications;
	}
	@Override
	public String toString() {
		return "\t\t\tMedicine [id=" + id + ", name=" + name + ", indications=" + indications + "]\n";
	}	
}
