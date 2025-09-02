package cts.sdet_training.java_repo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// data types
		// primitive data types
		int number = 123;
		// non-primitive data types
		Employee trainee = new Employee(20, 1000);
		System.out.println("This is from a primitive data type:" + number);
		System.out.println("Employee age:" + trainee.age);
		System.out.println("Employee salary:" + trainee.salary);
		// separator
		System.out.println("-".repeat(80));
		// static method call
		printSmth();
		// non-static method call
		App object = new App();
		object.printSmthelse();
	}

	// static method
	static void printSmth() {
		System.out.println("This is from a static method");
	}

	// non-static method
	void printSmthelse() {
		System.out.println("This is from a non-static method");
	}

}

class Employee {
	int age;
	float salary;

	public Employee(int age, float salary) {
		this.age = age;
		this.salary = salary;
	}
}
