package edu.uniandes.veterinary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import uk.co.jemos.podam.api.DefaultClassInfoStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class VeterinaryManagerTest {
	@Before
	public void setup() {
		DefaultClassInfoStrategy classInfoStrategy = DefaultClassInfoStrategy.getInstance();
		try {
			classInfoStrategy.addExtraMethod(Diagnostic.class, "initMedication");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Test 
	public void simpleTest() {
		
		PodamFactory factory = new PodamFactoryImpl();
		Pet pet = factory.manufacturePojo(Pet.class);
		assertNotNull(pet);
		assertNotNull(pet.getOwner());
		assertNotNull(pet.getBreed());
		assertNotNull(pet.getDiagnostics());
		for (Diagnostic d : pet.getDiagnostics()) {
			assertNotNull(d.getDate());
			assertNotNull(d.getDescription());
			assertNotNull(d.getMedication());
			assertNotNull(d.getDicease());
		}
	}
	
	@Test 
	public void colorTest() {
		for (int i = 0; i < 1000; i++) {
			PodamFactory factory = new PodamFactoryImpl();
			Pet pet = factory.manufacturePojo(Pet.class);
			assertTrue("", ColorProvider.exist(pet.getColor()));
		}
	}
	@Test 
	public void medicineTest() {
		for (int i = 0; i < 1000; i++) {
			PodamFactory factory = new PodamFactoryImpl();
			Pet pet = factory.manufacturePojo(Pet.class);
			for (Diagnostic d : pet.getDiagnostics()) {
				assertTrue(d.getDicease().getMedicines().size() == 2);
				
			}
		}
	}
	@Test 
	public void telephoneTest() {
		for (int i = 0; i < 1000; i++) {
			PodamFactory factory = new PodamFactoryImpl();
			Pet pet = factory.manufacturePojo(Pet.class);
			assertTrue(1000000 <= pet.getOwner().getPhone() && pet.getOwner().getPhone() <= 9999999);
		}
	}
	@Test 
	public void medicationTest() {
		for (int i = 0; i < 1000; i++) {
			PodamFactory factory = new PodamFactoryImpl();
			Pet pet = factory.manufacturePojo(Pet.class); 
			boolean badDiagnostic = false;
			for (Diagnostic d : pet.getDiagnostics()) {
				boolean exist = false;
				Medicine medicine = d.getMedication().getMedicine();
				for (Medicine m : d.getDicease().getMedicines()) {
					if (m.getId() == medicine.getId()) {
						exist = true;
						break;
					}
				}
				if (!exist) {
					badDiagnostic = true;
				}
			}
			assertFalse(badDiagnostic);
		}
	}
}
