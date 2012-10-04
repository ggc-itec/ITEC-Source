package test;

/**Program: Entity  * @author: ITEC 2150  * @version 1.0  * Course: ITEC 2150  * Written: Sept 24, 2012  *  * Inheritance Test Question**/
import java.util.ArrayList;

public abstract class Entity {
	private String name;
	private int healthPoints;
	private ArrayList<Item> inventory;
	private final int MAX_HEALTH = 100;

	public Entity(String name) {
		this.name = name;
		inventory = new ArrayList<Item>();
		healthPoints = MAX_HEALTH;
	}

	public String getName() {
		return name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void addItem(Item item) {
		inventory.add(item);
	}

	public void removeItem(Item item) {
		inventory.remove(item);
	}

	public boolean isItemAvailable(Item item) {
		if (inventory.contains(item)) {
			return true;
		} else {
			return false;
		}
	}

	public void takeDamage(int hit) {
		healthPoints -= hit;
	}

	public void takeHealing(int heal) {
		healthPoints += heal;
	}

	@Override
	public String toString() {
		String items = name + ": ";
		for (Item i : inventory) {
			items = items + i.getName() + " ";
		}
		return items;
	}

	public abstract String getGreeting();
}
