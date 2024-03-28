package controleur;

import villagegaulois.Village;
import personnages.Chef;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles",10,5);
		abraracourcix = new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
		
	}

	@Test
	void testControlEmmenager() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager, "Constructeur ne renvoie pas null");
	}

	@Test
	void testIsHabitant() {
	ControlEmmenager controlEmmenager = new ControlEmmenager(village);
	controlEmmenager.ajouterGaulois("Bonemine", 10);
	assertTrue(controlEmmenager.isHabitant("Bonemine"));
	assertFalse( controlEmmenager.isHabitant("Existe pas"));
	controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
	assertTrue(controlEmmenager.isHabitant("Panoramix"));
	}

	@Test
	void testAjouterDruide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
		
	}

	@Test
	void testAjouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Obelix", 10);
		assertTrue(controlEmmenager.isHabitant("Obelix"));
	}

}
