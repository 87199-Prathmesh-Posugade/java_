package com.app.fruits;

public class Orange extends Fruit {
	@Override
	public String taste() {
		return "sour";
	}

	public Orange() {
		this("orangeC", "Orange", 300.45, true);
	}

	public Orange(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
	}
}