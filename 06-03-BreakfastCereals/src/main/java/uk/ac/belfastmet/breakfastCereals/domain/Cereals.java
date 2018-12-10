package uk.ac.belfastmet.breakfastCereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cereals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String manufacturer;
	private String cerealName;
	private String energyKj;
	private String caloriesKcal;
	private String protienG;
	private String carbohydrateG;
	private String sugarsG;
	private String fatG;
	private String saturatesG;
	private String fibreG;
	private String sodiumG;
	private String saltG;
	private String ironMg;
	
	
	public Cereals() {
		super();
	}


	public Cereals(String manufacturer, String cerealName, String energyKj, String caloriesKcal, String protienG,
			String carbohydrateG, String sugarsG, String fatG, String saturatesG, String fibreG, String sodiumG,
			String saltG, String ironMg) {
		super();
		this.manufacturer = manufacturer;
		this.energyKj = energyKj;
		this.caloriesKcal = caloriesKcal;
		this.protienG = protienG;
		this.carbohydrateG = carbohydrateG;
		this.sugarsG = sugarsG;
		this.fatG = fatG;
		this.saturatesG = saturatesG;
		this.fibreG = fibreG;
		this.sodiumG = sodiumG;
		this.saltG = saltG;
		this.ironMg = ironMg;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getCerealName() {
		return cerealName;
	}


	public void setCerealName(String cerealName) {
		this.cerealName = cerealName;
	}


	public String getEnergyKj() {
		return energyKj;
	}


	public void setEnergyKj(String energyKj) {
		this.energyKj = energyKj;
	}


	public String getCaloriesKcal() {
		return caloriesKcal;
	}


	public void setCaloriesKcal(String caloriesKcal) {
		this.caloriesKcal = caloriesKcal;
	}


	public String getProtienG() {
		return protienG;
	}


	public void setProtienG(String protienG) {
		this.protienG = protienG;
	}


	public String getCarbohydrateG() {
		return carbohydrateG;
	}


	public void setCarbohydrateG(String carbohydrateG) {
		this.carbohydrateG = carbohydrateG;
	}


	public String getSugarsG() {
		return sugarsG;
	}


	public void setSugarsG(String sugarsG) {
		this.sugarsG = sugarsG;
	}


	public String getFatG() {
		return fatG;
	}


	public void setFatG(String fatG) {
		this.fatG = fatG;
	}


	public String getSaturatesG() {
		return saturatesG;
	}


	public void setSaturatesG(String saturatesG) {
		this.saturatesG = saturatesG;
	}


	public String getFibreG() {
		return fibreG;
	}


	public void setFibreG(String fibreG) {
		this.fibreG = fibreG;
	}


	public String getSodiumG() {
		return sodiumG;
	}


	public void setSodiumG(String sodiumG) {
		this.sodiumG = sodiumG;
	}


	public String getSaltG() {
		return saltG;
	}


	public void setSaltG(String saltG) {
		this.saltG = saltG;
	}


	public String getIronMg() {
		return ironMg;
	}


	public void setIronMg(String ironMg) {
		this.ironMg = ironMg;
	}
	
	
	
	

}
