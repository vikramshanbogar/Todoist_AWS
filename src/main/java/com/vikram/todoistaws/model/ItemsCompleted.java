package com.vikram.todoistaws.model;

import java.util.ArrayList;

public class ItemsCompleted {
	ArrayList<Item> items = new ArrayList<Item>();

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

}