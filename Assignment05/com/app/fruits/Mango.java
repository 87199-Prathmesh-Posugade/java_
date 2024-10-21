package com.app.fruits;

public class Mango extends Fruit {
	@Override
	public String taste() {
		return "sweet";
	}

	public Mango() {
		this("yellow", "Mango", 355.45, true);
	}

	public Mango(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
	}
}