package com.mishra;

public class Alien {

	private int age;
	private Computer computer;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age is assigned using setter");
		this.age = age;
	}

	/*
	 * using property name="age"
	 */
	Alien() {
		System.out.println("Alien default contructor invoked...");
	}

	/*
	 * using constructor-arg
	 */
	public Alien(int age) {
		this.age = age;
	}

	public void code() {

		System.out.println("\n-----I am coding in Alien------");

		System.out.println("age: " + age);

		computer.compile();
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

}
