package exercises;


public class Smurf {

	private static String name;
	
	public static Smurf createSmurf(String name) {
		if(Smurf.name!=name) {
			System.out.println("Creating " + name + " Smurf");	
		}
		return new Smurf(name);
	}
	
	

	private Smurf(String name) {
//		if(name == "papa") {
//			this.name = newName;
//			System.out.println(name);
//		} else if(name == "smurfette") {
//			this.name = newName2;
//			System.out.println(name);
//		} else {
			this.name = name;
//			Smurf.name = name;
//		}	
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
