package com.te.RestaurantProject;

public class PriceSection {

	int item;
	double price;
	int quantity;
	public PriceSection(int item,int quantity) {
		this.item = item;
		this.price = check(item);
		this.quantity = quantity;
	}
	private double check(int item) {
		int price = 0;
		switch (item) {
		case 1:	price = 20;
			break;
		case 2:	price = 40;
		break;
		case 3:	price = 10;
		break;
		case 4:	price = 50;
		break;
		case 5:	price = 30;
		break;
		case 6:	price = 60;
		break;
		case 7:	price = 20;
		break;
		case 8:	price = 50;
		break;

		default:
			break;
		}
		return price;
	}
	
}
