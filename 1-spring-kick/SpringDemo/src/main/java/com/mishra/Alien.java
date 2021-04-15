package com.mishra;

public class Alien {

	private int age;
	private Computer computer;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age is assigned");
		this.age = age;
	}

	Alien() {
		System.out.println("Alien contructor invoked...");
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
