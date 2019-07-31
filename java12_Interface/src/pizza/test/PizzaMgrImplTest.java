package pizza.test;

import java.util.ArrayList;

import pizza.manage.PizzaMgrImpl;
import pizza.parent.Pizza;

public class PizzaMgrImplTest {
	public static void main(String[] args) {
		PizzaMgrImpl mgr = PizzaMgrImpl.getInstance();
		ArrayList<Pizza> list = new ArrayList<>();
		
		list.add(new PotatoPizza(12000, "Mr Pizza"));
		list.add(new BulgogiPizza(18000, "Pizza Hut"));
		list.add(new PineApplePizza(22000, "Domino Pizza"));
		
		mgr.allMakePizza(list);
	}

}
