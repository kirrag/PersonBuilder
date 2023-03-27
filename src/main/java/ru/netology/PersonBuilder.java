package ru.netology;

import java.lang.IllegalStateException;

public class PersonBuilder {
	protected String name;	
	protected String surname;
	protected Integer age;
	protected String address;

	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	public PersonBuilder setAge(Integer age) {
		if (age < 0) {
			throw new IllegalStateException();
		}
		this.age = age;
		return this;
	}
	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public Person build() {
		if (name.equals(null) || surname.equals(null) || age.equals(null) || address.equals(null)) {
			throw new IllegalStateException();
		}

		Person person = new Person(name, surname, age, address);
		return person;
	}
}
