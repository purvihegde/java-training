package cts.sdet_training.java_repo;

public class Exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= null;
		try {
		System.out.println(name.toLowerCase());

	}
		catch(NullPointerException npe) {
			System.out.println("handle null values");
		}
		System.out.println("after  exception");
	}
}
