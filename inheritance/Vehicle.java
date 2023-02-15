package inheritance;

public class Vehicle {

	private final String serialNumber;
	private int noPersons;
	private String name;
	
	Vehicle(String serialNumber, int noPersons){
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	Vehicle(String serialNumber, int noPersons, String name){
		this(serialNumber, noPersons);
		this.name = name;
	}
	
	public final String getSerialNumber() {
		return this.serialNumber;
	}
	
	public boolean goTo(double posX, double posY) {
		System.out.println("Error. unknown type");
		return false;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("Error. unknown type");
		return false;
	}
	
	public void print() {
		System.out.println(String.format("Vehicle properties: %n\t- serial number: %s" + "%n\t- capacity: %d persons"
				+ "%n\t- name: %s", this.serialNumber, this.noPersons, this.name));
	}
	
	public void test() {
		System.out.println("test");
	}
	
	
}
