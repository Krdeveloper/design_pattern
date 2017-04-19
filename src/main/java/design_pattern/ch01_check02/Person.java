package design_pattern.ch01_check02;

import java.util.Arrays;

public class Person {
	private Phone[] phones;
	
	
	public Person() {
		phones= new Phone[1];
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [phones=" + Arrays.toString(phones) + "]";
	}

	
	
	
}
