package com.app.fruits;

public class Apple extends Fruit {
	@Override
	public String taste() {
		return "sweent n sour";
	}

	public Apple() {
		this("red", "Apple", 340.09, true);
	}
	
	public Apple(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
	}
}