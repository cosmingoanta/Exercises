package inheritance;


public class OnWater extends Vehicle{

	int noEngines;
	int cargoCapacity; //in liters
	
	OnWater(String serialNumber, int noPersons){
		super(serialNumber, noPersons);
	}
	
	OnWater(String serialNumber, int noPersons, String name){
		super(serialNumber, noPersons, name);
	}
	
	OnWater(String serialNumber, int noPersons, String name, int noEngines){
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
	}
	
	OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity){
		this(serialNumber, noPersons, name, cargoCapacity);
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public boolean goTo(double posX, double posY) {
		System.out.println(String.format("Sailing the vessel to coordinates: [%f, %f]", posX, posY));
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println(String.format("Adding %f liters of fiel to the boat", amount));
		return true;
	}
}
