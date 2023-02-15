package recapitulare;

public class Arr {
	public static int[] moveZeros(int[] arr) {
		int[] res = new int[arr.length];
		int zero = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zero++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				res[zero] = arr[i];
				zero++;
			}
		}
		return res;
	}
	
	public static double[] bubbleSort(double[] arr) {
		boolean swap = true;
		int end = arr.length - 1;
		while(swap == true) {
			swap = false;
			for(int i = 0; i < end; i++) {
				if(arr[i] > arr[i + 1]) {
					double aux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = aux;
					swap = true;
				}
			}
			end--;
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void print(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
