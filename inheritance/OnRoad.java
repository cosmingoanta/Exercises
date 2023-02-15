package inheritance;

public class OnRoad extends Vehicle{
	
	int noWheels;
	int noDoors;
	
	OnRoad(String serialNumber, int noPersons){
		super(serialNumber, noPersons);
	}
	
	OnRoad(String serialNumber, int noPersons, String name){
		super(serialNumber, noPersons, name);
	}
	
	OnRoad(String serialNumber, int noPersons, String name, int noWheels){
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
	}
	
	OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors){
		this(serialNumber, noPersons, name, noWheels);
		this.noDoors = noDoors;
	}
	
	@Override
	public boolean goTo(double posX, double posY) {
		System.out.println(String.format("Driving the car to coordonates: [%f, %f]", posX, posY));
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println(String.format("Adding %f liters of fuel to the Road Vehicle", amount));
		return true;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(String.format("Driving vehicle properties: %n\t- number of wheels: %d %n\t- number of doors: %d", this.noWheels, this.noDoors));
	}
	
}
