package by.vashkevich.pizza.main;

import java.util.Scanner;

public class HousePizza {

	public void Privetstvie() {
		System.out.println("����� ����!");
		System.out.println("� ��� � ������������ :");
		System.out.println("���������");
		System.out.println("���������");
		System.out.println("����������");
		System.out.println("����� ����� �� ������� ?");
	}

	public String enterName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �������� �����: ");
		String name = sc.next();
		return name;
	}
	public int enterSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������: ");
		int size = sc.nextInt();
		return size;
	
}
}
