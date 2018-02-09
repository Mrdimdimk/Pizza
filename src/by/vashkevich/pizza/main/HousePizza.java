package by.vashkevich.pizza.main;

import java.util.Scanner;

public class HousePizza {

	public void Privetstvie() {
		System.out.println("Дорый день!");
		System.out.println("У нас в Ассортименте :");
		System.out.println("Пеперонои");
		System.out.println("Гавайская");
		System.out.println("Итальянска");
		System.out.println("Какую пиццу вы желаете ?");
	}

	public String enterName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название пиццы: ");
		String name = sc.next();
		return name;
	}
	public int enterSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер: ");
		int size = sc.nextInt();
		return size;
	
}
}
