package factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name; // 피자이름
	String dough; 
	String sauce; 
	ArrayList toppings = new ArrayList(); 
	
	public void prepare() {
		System.out.println("Preparing " + name);
		
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(" "+ toppings.get(i));
		}
	}

	void bake() {
		System.out.println("Baking " + name);
	}

	void cut() {
		System.out.println("Cutting " + name);
	}

	void box() {
		System.out.println("Boxing " + name);
	}
	
	public String getName() {
		return name;
	}
}
