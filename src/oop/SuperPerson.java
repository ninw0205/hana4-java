package oop;

public class SuperPerson {
	SuperPerson() {

	}

	public static void main(String[] args) {
		Person hong = new Person("Hong", 33);
		System.out.println("hong = " + hong);
		Person kim = new Person("Kim", 30);
		System.out.println("kim = " + kim);
		System.out.println(kim.getAge());
	}
}
