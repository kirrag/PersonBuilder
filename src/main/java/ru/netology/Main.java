package ru.netology;

import java.util.OptionalInt;

//import java.util.Optional;
//import java.util.OptionalInt;

public class Main {
	public static void main(String[] args) {


		Person mom = new PersonBuilder()
				.setName("Анна")
				.setSurname("Вольф")
				.setAge(31)
				.setAddress("Сидней")
				.build();
		Person son = mom.newChildBuilder()
				.setName("Антошка")
				.setAge(10)
				.build();
		System.out.println("У " + mom + " есть сын, " + son);

		Person father = new PersonBuilder()
				.setName("Сергей")
				.setSurname("Иванов")
				.build();

		System.out.println("Возраст мамы: " + mom.getAge().getAsInt());
		System.out.println("Возраст сына: " + son.getAge().getAsInt());
		if (father.getAge().equals(OptionalInt.empty())) {
			System.out.println("Возраст отца не задан.");
		} else {
			System.out.println("Возраст отца: " + father.getAge().getAsInt());
		}

		try {
			// Не хватает обязательных полей
			new PersonBuilder().build();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		try {
			// Возраст недопустимый
			new PersonBuilder().setAge(-100).build();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
