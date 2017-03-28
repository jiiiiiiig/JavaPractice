package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  └Car2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 24.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class Car2 {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	public Car2() {

	}

	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;

	}

	// getter 메소드
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	// setter 메소드
	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}

	public void setPrice(int newPrice) {
		price = newPrice;
	}
}
