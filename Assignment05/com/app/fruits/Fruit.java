package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	private String color;
	private String name;
	private double weight;
	private boolean isFresh;

	public Fruit() {
		this("red", "Apple", 340.45, true);
	}

	public Fruit(String color, String name, double weight, boolean isFresh) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}

	public boolean getisFresh() {
		return isFresh;
	}

	public void setisFresh(boolean a) {
		isFresh = a;
	}

	public static int menuDriven(Scanner s) {
		System.out.println("1. Add Mango");
		System.out.println("2. Add Apple");
		System.out.println("3. Add Orange");
		System.out.println("4. See names of all Fruits");
		System.out.println("5. See Fresh Fruits in Bucket");
		System.out.println("6. See Stale Fruits in Bucket");
		System.out.println("7. Mark Fruit as Stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("9. Exit");
		System.out.print("0. Enter Choice: ");
		return s.nextInt();
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

	public abstract String taste();
}