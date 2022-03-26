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

	public FoodTruck(String truckName, String truckFoodType, int truckRating) {
		totalTrucks += 1;
		this.truckId = totalTrucks;
		this.truckName = truckName;
		this.truckFoodType = truckFoodType;
		this.truckRating = truckRating;
	}

	public FoodTruck() {
		totalTrucks += 1;
		this.truckId = totalTrucks;
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
		return "Truck ID: " + truckId + "\nName: " + truckName + "\nFood Type: " + truckFoodType + "\nRating: "
				+ truckRating + "\n";
	}
}
