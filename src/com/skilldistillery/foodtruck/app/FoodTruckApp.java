package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();

		Scanner sc = new Scanner(System.in);

		FoodTruck[] fleetArray = new FoodTruck[5];

		boolean isCreating = true;

		System.out.println("Welcome to Food Truck Creator");
		System.out.println("Please enter up to 5 Food Trucks");
		System.out.println("");

		int counter = 0;
		while (isCreating) {

			if (counter < 6) {
				System.out.print("Truck name: ");
				String userTruckName = sc.nextLine();

				if (userTruckName.equals("quit")) {
					System.out.println("Goodybye!");
					System.out.println("");
					isCreating = false;
					app.showMenu(fleetArray);
				}

				System.out.print("Truck food type: ");
				String userTruckFoodType = sc.nextLine();

				System.out.print("Truck rating: ");
				int userTruckRating = sc.nextInt();
				sc.nextLine();

				fleetArray[counter] = new FoodTruck(userTruckName, userTruckFoodType, userTruckRating);

				System.out.println();
				System.out.println();

			} else {
				System.out.println("You have added the maximum available food trucks. \n");
				app.showMenu(fleetArray);
			}
			counter++;
		}
	}

	public void showMenu(FoodTruck[] fleetArray) {
		Scanner sc = new Scanner(System.in);
		String userMenuChoice = "";
		while (userMenuChoice != "quit") {
			System.out.println("1. List all existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest-rated food truck");
			System.out.println("4. To quit the program, enter 'quit')");

			userMenuChoice = sc.nextLine();

			switch (userMenuChoice) {
			case "1":
				for (FoodTruck foodTruck : fleetArray) {
					if (foodTruck != null) {
						System.out.println(foodTruck);
					}
				}
				System.out.println();
				break;

			case "2":
				double avgRating = 0;
				int counter = 0;
				for (FoodTruck foodTruck : fleetArray) {
					if (foodTruck != null) {
						int rating = foodTruck.getTruckRating();
						avgRating += rating;
						counter++;
					}
				}
				avgRating /= counter;
				System.out.print("The avg rating is: " + avgRating);
				System.out.println();
				System.out.println();
				break;

			case "3":
				int highest = 0;
				FoodTruck highestRated = new FoodTruck();

				for (FoodTruck foodTruck : fleetArray) {
					if (foodTruck != null) {
						if (highest < foodTruck.getTruckRating()) {
							highestRated = foodTruck;
						}
					}
				}
				System.out.println("The highest-rated food truck is: " + highestRated + "\n");
				break;

			default:
				System.exit(0);
			}
		}
	}

}

//	TODO: finish the Readme file 
