package exercises;

public class Smurf {

	private static boolean papaCreated;
	private String name;


	public static Smurf createSmurf(String name) {

		if (name == "papa" && papaCreated){
			System.out.println("Papa has already been created");
		}

		if (name == "papa" && !papaCreated){
			papaCreated = true;
		}

		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
