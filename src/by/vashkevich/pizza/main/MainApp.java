package by.vashkevich.pizza.main;

import java.lang.reflect.Array;
import java.util.jar.Attributes.Name;

public class MainApp {

	public static void main(String[] args) {

		HousePizza house = new HousePizza();
		house.Privetstvie();
		//house.enterName();
		

		Pizza Novaja1 = new Pizza();
		Novaja1.size = 40;
		Novaja1.prise = 20;
		Novaja1.title = "Pepperoni";

		Pizza Novaja1_1 = new Pizza();
		Novaja1_1.size = 55;
		Novaja1_1.prise = 30;
		Novaja1_1.title = "Pepperoni";

		Pizza Novaja1_2 = new Pizza();
		Novaja1_2.size = 65;
		Novaja1_2.prise = 40;
		Novaja1_2.title = "Pepperoni";

		Pizza Novaja2 = new Pizza();
		Novaja2.size = 40;
		Novaja2.prise = 21;
		Novaja2.title = "Hawai";

		Pizza Novaja2_1 = new Pizza();
		Novaja2_1.size = 55;
		Novaja2_1.prise = 31;
		Novaja2_1.title = "Hawai";

		Pizza Novaja2_2 = new Pizza();
		Novaja2_2.size = 65;
		Novaja2_2.prise = 41;
		Novaja2_2.title = "Hawai";

		Pizza Novaja3 = new Pizza();
		Novaja3.size = 40;
		Novaja3.prise = 22;
		Novaja3.title = "Italy";

		Pizza Novaja3_1 = new Pizza();
		Novaja3_1.size = 55;
		Novaja3_1.prise = 32;
		Novaja3_1.title = "Italy";

		Pizza Novaja3_2 = new Pizza();
		Novaja3_2.size = 65;
		Novaja3_2.prise = 42;
		Novaja3_2.title = "Italy";

		Pizza[] ArrayPizz = new Pizza[] { Novaja1, Novaja1_1,Novaja1_2, Novaja2, Novaja2_1, Novaja2_2, Novaja3, Novaja3_1, Novaja3_2 };

		String namePizza = house.enterName();
		int sizePizza = house.enterSize();
		 
		 for (Pizza pizza : ArrayPizz )
		 { 
			// System.out.println(pizza.title + " " + pizza.size);
			 if (namePizza.equals(pizza.title)   & sizePizza == pizza.size )
			 {
				 String pizzName = "";
				 switch (pizza.size){
				 case 40 : pizzName = "Min";
						 break;
				 case 55: pizzName = "Middle";
				 break;
				 case 65 : pizzName = "Max";
				 break;
				 
				 
				 };
			
			 System.out.println("Цена на " +pizza.title + " "+ pizzName + " " + pizza.prise + " BYN");
			 return;
			 }
			 
		 }
		System.out.println("Такой пиццы нет");
		
		

	}

}
