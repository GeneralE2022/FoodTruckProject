package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

/* 
 * You will create a separate class with a main method that starts the program. 
 * It will have an array to store up to five FoodTruck objects. 
 * The main method of this class is the only static method in the entire project.
 */

public class FoodTruckApp {

	public static void main(String[] args) {

		/*
		 * #1 The user is prompted to input the name, food type, and rating for up to
		 * five food trucks. For each set of input, a FoodTruck object is created, its
		 * fields set to the user's input, and it is added to the array. The truck id is
		 * not input by the user, but instead assigned automatically in the FoodTruck
		 * constructor from a static field that is incremented as each truck is created.
		 */

		promptUser();

	}

	public static void promptUser() {
		Scanner sc = new Scanner(System.in);

		// generate empty array capable of holding up to 5 FoodTruck objects
		FoodTruck[] fleetArray = new FoodTruck[5];

		System.out.println("Welcome to Food Truck Creator");
		System.out.println("Please enter up to 5 Food Trucks");

		// enter up to 5 trucks' info (name, food type, rating)

		FoodTruck truck1 = new FoodTruck(0, 0, null, null, 0);
		fleetArray[0] = truck1;

		System.out.println("Truck name: ");
		truck1.createFoodTruck(0, sc.nextLine());

		System.out.println("Truck food type: ");
		truck1.setTruckFoodType(sc.nextLine());
		System.out.println("Truck rating: ");
		truck1.setTruckRating(sc.nextInt());

		truck1.toString();
		System.out.println(truck1);

	}
}

// works!
//		System.out.println(fleetArray[0].getTruckName());
//		System.out.println(fleetArray[0].getTruckFoodType());
//		System.out.println(fleetArray[0].getTruckRating());

// #2 If the user inputs quit for the food truck name, input ends immediately
// and the program continues.

/*
 * After input is complete, the user sees a menu from which they can choose to:
 * a. List all existing food trucks. b. See the average rating of food trucks.
 * c. Display the highest-rated food truck. d. Quit the program.
 */

// After choosing a menu item, the user sees the menu again and can choose
// another item until the choose to quit.

//	TODO: finish the Readme file 
