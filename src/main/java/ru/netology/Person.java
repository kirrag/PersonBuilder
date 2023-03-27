package ru.netology;

public class Person {
	protected final String name;	
	protected final String surname;
	protected Integer age;
	protected String address;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
  	}
  	public Person(String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
  		this.age = age;
  	}
  	public Person(String name, String surname, Integer age, String address) {
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
	public Integer getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	public boolean hasAge() { 
		if (age.equals(null)) {
			return false;
		} else {
			return true;
		}
	}

	public boolean hasAddress() {
		if (address.equals(null)) {
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

	//@Override
	//public int hashCode() { /*...*/ }

	public PersonBuilder newChildBuilder() {
		PersonBuilder builder = new PersonBuilder();
		builder.setSurname(this.surname);
		builder.setAge(this.age);
		builder.setAddress(this.address);
		return builder;
	}
}
