package exercises;

import java.util.ArrayList;

public class BetterArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterArrayList<String> bal = new BetterArrayList<>();
		
//		ArrayList<String> names = new ArrayList<>();
		
//		Alien andrei = new Alien("Andrei", "Drei");
//		Alien bloom = new Alien("Ester", "Bloom");
		
		bal.add("andrei");
		bal.add("bloom");
		bal.add("picci");
		bal.add("raffy");
		bal.add("kala");
		
		bal.print(bal);
		System.out.println("=====pop=====");
		bal.pop(bal);
	}
}
