package ru.netology;

import java.util.OptionalInt;
import java.util.Objects;

public class Person {
	protected final String name;
	protected final String surname;
	protected int age;
	protected String address;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Person(String name, String surname, int age, String address) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surname;
	}

	public OptionalInt getAge() {
		return OptionalInt.of(age);
	}

	public String getAddress() {
		return address;
	}

	public boolean hasAge() {
		if (age < 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean hasAddress() {
		if (address == null) {
			return false;
		} else {
			return true;
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void happyBirthday() {
		age++;
	}

	@Override
	public String toString() {
		return name + " " + surname + " (" + age + ", " + address + ")";
	}

	@Override
	public int hashCode() {
		 return Objects.hash(name, surname, age, address);
	}

	public PersonBuilder newChildBuilder() {
		PersonBuilder builder = new PersonBuilder();
		builder.setSurname(this.surname);
		builder.setAge(this.age);
		builder.setAddress(this.address);
		return builder;
	}
}
