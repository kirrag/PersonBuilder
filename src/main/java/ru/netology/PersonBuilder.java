package ru.netology;

import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.util.OptionalInt;

public class PersonBuilder {
	protected String name;	
	protected String surname;
	protected int age;
	protected String address;

	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	public PersonBuilder setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException();
		}
		this.age = age;
		return this;
	}
	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public Person build() {
		if (name == null || surname == null) {
			throw new IllegalStateException();
		}

		Person person = new Person(name, surname, age, address);
		return person;
	}
}
