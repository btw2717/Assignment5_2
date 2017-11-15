/**
 * The Person class contains instance variables name and age which are the attributes that are operated upon by the methods of this class.
 * License GNU
 * Created: 14NOV2017
 * email: email
 * @version 1.0
 * @author sapper
 */

public class Person {
	//class attributes
	private String name;
	private int age;

	/**
	 * The Person() method is a constructor method used to instantiate a Person object with default attributes.
	 * default attributes are: 
	 * name = "no name yet"
	 * age = 0
	 */

	public Person() {
		name = "no name yet.";
		age = 0;
	}

	/**
	 * This method is an overloaded constructor method used to instantiate an object of the class Person with parameters that modify the default attribute values.
	 * @param name a string which sets the name of the Person object
	 * @param age an integer which sets the age of the Person object
	 * This method sets the class attributes to the entered parameters of the constructor.
	 */

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * This method is an accessor method which returns the current String variable set to the attribute 'name'
	 * @return returns the String contained in the 'name variable'
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * This method is a mutator method which sets the variable 'name' to whatever String is entered as the parameter.
	 * @param name A String which will replace the value of the 'name' attribute.
	 */

	public void setName(String name) {
		this.name = name;//this refers to the class
	}

	/**
	 * This method is an accessor method which returns the current age integer of a Person object.
	 * @return returns the age value
	 */

	public int getAge() {
		return this.age;
	}

	/**
	 * This method is a mutator method which alters the value of the 'age' attribute.
	 * @param age An integer which will be set as the value of the variable 'age'
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * This method is an accessor method which returns a concatenated string containing the current String stored in the variable 'name' and the current integer stored in the variable 'age'
	 * @return returns the name and age values of the Person object
	 */

	public String toString() {
		return "Name: " + this.name + " " + "Age: " + this.age; 
	}
}
