package collections;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<String> update(ArrayList<String> species) {
	    species.add("Tyrannosaurus");
	    species.add(0, "Sauropoda");
	 
	    species = new ArrayList<String>(species);
	    species.add("Giganotosaurus");
	 
	    return species;
	  }

	public static void main(String[] args) {
		ArrayList<String> dinosaurs = new ArrayList<String>();
	    dinosaurs.add("Spinosaurus");
	    ArrayList<String> dinosaursUpdated = update(dinosaurs);
	 
	    System.out.println(dinosaurs.size() + dinosaursUpdated.size());    
	    System.out.println(dinosaurs);
	    System.out.println(dinosaursUpdated);
		

	}

}
