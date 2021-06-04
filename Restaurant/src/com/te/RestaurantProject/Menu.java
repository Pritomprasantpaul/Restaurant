package com.te.RestaurantProject;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("Welcome to Pritaurant.com");
		System.out.println("Food that makes you feel HOME");

		while(true){
			System.out.println("Welcome to South Indian Food Court\n");
			System.out.println("You get:");
			System.out.println("1)Idli : 2 Pieces (Rs.20):");
			System.out.println("2)Butter Cheese Dosa : 1 Pieces (Rs.40) :");
			System.out.println("3)Vada : 2 Pieces: (Rs.10)");
			System.out.println("Welcome to North Indian Food Court\n");
			System.out.println("You get:");
			System.out.println("4)Chole Bhature : 2 Pieces: (Rs.50)");
			System.out.println("5)Litti Chokha : 4 Pieces: (Rs.30)");
			System.out.println("Welcome to Desserts Food Court\n");
			System.out.println("You get: ");
			System.out.println("6)Rasmalai (Rs.60)");
			System.out.println("7)Rasgulla : 2 Pieces (Rs.20)");
			System.out.println("8)Gajar ka halwa (Rs.50)");
			System.out.println("Press any other key Nothing Else");
			int option = sc.nextInt();
			if(option>0 && option<9)
				sum = sum + quantity(sc, option);
			else
				break;
		}
		System.out.println("Your Final amount is "+sum);
		System.out.println("Thanks for ordering from our App. Visit again");

	}

	private static double quantity(Scanner sc, int option) {
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();
		PriceSection price = new PriceSection(option, quantity);
		return calculate(price);
	}

	private static double calculate(PriceSection price) {
		return (price.price*price.quantity);
	}

}
