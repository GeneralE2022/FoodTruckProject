package com.skilldistillery.foodtruck.entities;

/* 
 * You will define a FoodTruck class with fields for a unique numeric id, a name 
 * ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), 
 * and a numeric rating.
 */

public class FoodTruck {

	private static int totalTrucks = 0;
	private int truckId;
	private String truckName;
	private String truckFoodType;
	private int truckRating;

	// constructors

	public FoodTruck(int totalTrucks, int truckId, String truckName, String truckFoodType, int truckRating) {
		this.truckId = truckId;
		this.truckName = truckName;
		this.truckFoodType = truckFoodType;
		this.truckRating = truckRating;
	}

	public FoodTruck(int id, String name) {
		this.truckId = truckId;
		this.truckName = truckName;
		this.truckFoodType = truckFoodType;
		this.truckRating = truckRating;
	}

	public FoodTruck() {
		this.truckId = truckId;
		this.truckName = truckName;
		this.truckFoodType = truckFoodType;
		this.truckRating = truckRating;
	}

	// method to create new food truck
	public void createFoodTruck(int id, String str) {
		FoodTruck tName = new FoodTruck();
		tName.truckId = id;
	}

	public static int getTotalTrucks() {
		return totalTrucks;
	}

	public static void setTotalTrucks(int totalTrucks) {
		FoodTruck.totalTrucks = totalTrucks;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckFoodType() {
		return truckFoodType;
	}

	public void setTruckFoodType(String truckFoodType) {
		this.truckFoodType = truckFoodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	@Override
	public String toString() {
		return "FoodTruck [truckId=" + truckId + ", truckName=" + truckName + ", truckFoodType=" + truckFoodType
				+ ", truckRating=" + truckRating + "]";
	}
}
