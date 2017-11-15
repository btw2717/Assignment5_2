/**
 * The PersonDriver class utilizes the main() method to test two Person objects for equality.
 * Created: 14NOV2017
 * email: email
 * @version 1.0
 * @author sapper
 */

public class PersonDriver {

	/**
	 * The main() method creates and initializes two objects of the class Person and then utilizes methods from both the Person class and the String class to test them for equality.
	 * The main() method is a void method so it does something other than return a value
	 * @param args Argument passed to the application from the command line.
	 */

	public static void main(String[] args) {
		//Creating and initializing a Person object using constructor parameters
		Person me = new Person("Brady", 29);
		//Creating and initializing a Person object using a constructor with no parameters
		Person teacher = new Person();
		//setName mutator method to set the name of the Person object
		teacher.setName("Tanes");
		//setAge mutator method to set the age of the Person object
		teacher.setAge(30);

		//Display name and age of both Person objects using the toString method
		System.out.println("Person 1 is: " + me.toString());
		System.out.println("Person 2 is: " + teacher.toString());
		System.out.println();

		//Test for equality of name and/or age and display the results
		if((me.getName().equals(teacher.getName())) && (me.getAge()) == (teacher.getAge())) {
			System.out.println("The names and ages of the people are equal");
			System.out.println();
		} else {
			if(me.getName().equals(teacher.getName())) {
				System.out.println("The names are equal, but not the ages");
				System.out.println();
			} else if(me.getAge() == teacher.getAge()) {
				System.out.println("The people are the same age but have different names");
				System.out.println();
			} else {
				System.out.println("Neither the names nor ages of the people are equal");
				System.out.println();
			}
		}
		if(me.getAge() > teacher.getAge()) {
			System.out.println(me.getName() + " is older than " + teacher.getName());
			System.out.println();
		} else {
			System.out.println(me.getName() + " is younger than " + teacher.getName());
		}

	}
}
