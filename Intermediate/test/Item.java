package test;

/**
 * Program: Item * @author: ITEC 2150 * @version 1.0 * Course: ITEC 2150 *
 * Written: Sept 24, 2012 * * Inheritance Test Question
 **/
public class Item {
	private String name;
	private boolean weapon;

	public Item(String name) {
		this.name = name;
		weapon = false;
	}

	public String getName() {
		return name;
	}

	public void setWeapon() {
		weapon = true;
	}

	public boolean isWeapon() {
		return weapon;
	}

	@Override
	public boolean equals(Object obj) {
		if (name.equals(((Item) obj).getName())) {
			return true;
		} else {
			return false;
		}
	}
}