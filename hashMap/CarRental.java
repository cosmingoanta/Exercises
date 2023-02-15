package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CarRental {

	private HashMap<String, String> carList = new HashMap<>(100,0.5f);
	private HashMap<String, RentedCars> carListByOwner = new HashMap<>(100, 0.5f);

	private static String getPlateNo(Scanner sc) {
		System.out.println("Enter the plate number:");
		return sc.nextLine();
	}

	private static String getOwnerName(Scanner sc) {
		System.out.println("Enter the name of the owner");
		return sc.nextLine();
	}

	private boolean isCarRented(String plateNo) {
		return carList.containsKey(plateNo);
	}

	private String getCarRenter(String plateNo) {
		return carList.get(plateNo);
	}

	private void rentCar(String plateNo, String name) {
		if(isCarRented(plateNo)) {
			System.out.println(String.format("The car %s has been already rented by %s", plateNo, carList.get(plateNo)));
		} else {
			carList.put(plateNo, name);
			if(!carListByOwner.containsKey(name)) {
				carListByOwner.put(name, new RentedCars(plateNo));
			} else {
				carListByOwner.get(name).addCar(plateNo);
			}
		}
	}

	private void returnCar(String plateNo) {
		if(carList.containsKey(plateNo)) {
			carListByOwner.get(plateNo).returnCar(plateNo);
			carList.remove(plateNo);
			System.out.println(String.format("The car has with plates %s has been returned succesfully", plateNo));
		} else {
			System.out.println("The car could not be found");
		}
	}
	
	private void getCarsNo(String name) {
		if(carListByOwner.get(name) != null) {
			System.out.println(String.format("%s has %d cars rented.", name, carListByOwner.get(name).size()));
		} else {
			System.out.println("Owner has no cars rented.");
		}
	}
	
	private void getCarsList(String name) {
		if(carListByOwner.get(name) != null) {
			carListByOwner.get(name).getRentedCars();
		} else {
			System.out.println("Owner has no cars rented.");
		}
	}

	private static void printCommandsList() {
		System.out.println("help         - Afiseaza aceasta lista de comenzi");
		System.out.println("add          - Adauga o noua pereche (masina, sofer)");
		System.out.println("check        - Verifica daca o masina este deja luata");
		System.out.println("remove       - Sterge o masina existenta din hashtable");
		System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
		System.out.println("quit         - Inchide aplicatia");
		System.out.println("size         - Get total number of rented cars");
		System.out.println("getCarsNo    - Show the number of cars owned by a given owner");
		System.out.println("getCarsList  - Show the list of cars owned by a given owner");
	}

	public void run(Scanner sc) {
		boolean quit = false;
		while (!quit) {
			System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
			String command = sc.nextLine();
			switch (command) {
			case "help":
				printCommandsList();
				break;
			case "add":
				rentCar(getPlateNo(sc), getOwnerName(sc));
				break;
			case "check":
				System.out.println(isCarRented(getPlateNo(sc)));
				break;
			case "remove":
				returnCar(getPlateNo(sc));
				break;
			case "getOwner":
				System.out.println(getCarRenter(getPlateNo(sc)));
				break;
			case "size":
				System.out.println(carList.size());
				break;
			case "getCarsNo":
				getCarsNo(getOwnerName(sc));
				break;
			case "getCarsList":
				getCarsList(getOwnerName(sc));
				break;
			case "quit":
				System.out.println("Aplicatia se inchide...");
				quit = true;
				break;
			default:
				System.out.println("Unknown command. Choose from:");
				printCommandsList();
			}
		}
	}

	public static void main(String[] args) {
		// create and run an instance (for test purpose)
		new CarRental().run(new Scanner(System.in));
	}
}
