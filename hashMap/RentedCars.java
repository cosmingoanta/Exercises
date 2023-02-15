package hashMap;

import java.util.ArrayList;

public class RentedCars{
	
	private ArrayList<String> rentedCars = new ArrayList<String>();
	
	RentedCars(){
		
	}
	
	RentedCars(String plateNo){
		rentedCars.add(plateNo);
	}
	
	public void addCar(String plateNo) {
		rentedCars.add(plateNo);
	}
	
	public void returnCar(String plateNo) {
		rentedCars.remove(plateNo);
	}
	
	public int size() {
		return rentedCars.size();
	}
	
	public boolean isEmpty() {
		if(rentedCars.size() != 0) {
			return false;
		}
		return true;
	}
	
	public void getRentedCars() {
		System.out.println("The rented cars are: ");
		for(String s : rentedCars) {
			System.out.print(s + "; ");
		}
	}
	
}
