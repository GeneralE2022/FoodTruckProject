package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FoodTruck[] fleetArray = new FoodTruck[5];
		boolean isCreating = true;
		int counter = 0;

		System.out.println("Welcome to Food Truck Creator");
		System.out.println("Please enter up to 5 Food Trucks");
		System.out.println("");

		while (isCreating && counter < 6) {

			System.out.print("Truck name: ");
			String userTruckName = sc.nextLine();

			if (userTruckName.equals("quit")) {
				System.out.print("Goodybye!");
				isCreating = false;
				showMenu(fleetArray);
			}

			System.out.print("Truck food type: ");
			String userTruckFoodType = sc.nextLine();

			System.out.print("Truck rating: ");
			int userTruckRating = sc.nextInt();
			sc.nextLine();

			fleetArray[counter] = new FoodTruck(userTruckName, userTruckFoodType, userTruckRating);

			System.out.println();
			System.out.println();
			System.out.println();
			counter++;
		}
	}

	private static void showMenu(FoodTruck[] fleetArray) {
		Scanner sc = new Scanner(System.in);
		String userMenuChoice = "";
		while (userMenuChoice != "quit") {
			System.out.println("1. List all existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest-rated food truck");
			System.out.println("4. To quit the program, enter quit)");

			userMenuChoice = sc.nextLine();

			switch (userMenuChoice) {
			case "1":
				// loop through array and sysout existing objects
				for (int i = 0; i < fleetArray.length; i++) {
					fleetArray[i].toString();
				}
				break;

			case "2":
				System.out.println("The avg rating is: ");
				// loop through array and apply the math
				break;

			case "3":

//				loop 

				break;

			default:
				break;
			}
		}
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
