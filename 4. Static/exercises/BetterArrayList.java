package exercises;

import java.util.ArrayList;

public class BetterArrayList<String> extends ArrayList<String> {
	
	public void pop(BetterArrayList<String> names) {
		//pop returns the last item added!
		
//		if(names.isEmpty()) {
//			return null;
//		}
//		String top = names.get(names.size()-1);
//		names.remove(names.size()-1);
//		return top;
		System.out.println(names.size());
		int size = names.size();
		System.out.println("the last added element is: " + names.get(size-1));
	}
	
	public void print(BetterArrayList<String> names) {
		names.forEach(name -> {
			System.out.println(name);
		});
	}
}
