package exercises;

import java.util.Arrays;

public class Main {

	public static int returnIndexBinary(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] == key) {
				return mid;
			} else if(key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			System.out.println(mid);
		}

		return mid;

	}

	public static int insertIndexBinary(int[] arr, int key) {
		if(key < arr[0]) {
			return 0;
		}
		if(key > arr[arr.length - 1]) {
			return arr.length;
		}
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if(arr[mid] > key){
			return mid;
		} else {
			return mid + 1;
		}


	}

	public static boolean isPerfSquare(int n) {
		int left = 1;
		int right = n;
		long mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(mid * mid == n) {
				return true;
			} else if(n < mid * mid) {
				right = (int) mid - 1;
			} else {
				left = (int) mid + 1;
			}
			System.out.println(mid);
		}
		return false;
	}

	public static int[] invert(int[] arr) {
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[arr.length - i - 1];
		}
		return res;
	}

	public static int[] addBigNumber(int[] arr1, int[] arr2) {
		arr1 = invert(arr1);
		arr2 = invert(arr2);
		int res[] = new int[Integer.max(arr1.length, arr2.length) + 1];
		if(arr1.length <= arr2.length) {


			int sum = 0;
			for(int i = 0; i < arr1.length; i++) {
				sum += arr1[i] + arr2[i];
				if(sum > 9) {
					res[i] = sum % 10;
					sum = 1;
				} else {
					res[i] = sum;
					sum = 0;
				}
				System.out.println(res[i]);
			}
			
			for(int i = arr1.length; i < arr2.length; i++) {
				sum += arr2[i];
				if(sum > 9) {
					res[i] = sum % 10;
					sum = 1;
				} else {
					res[i] = sum;
					sum = 0;
				}
				System.out.println(res[i]);
				res[res.length - 1] = sum;
			}
			
		} else {
			int sum = 0;
			for(int i = 0; i < arr2.length; i++) {
				sum += arr1[i] + arr2[i];
				if(sum > 9) {
					res[i] = sum % 10;
					sum = 1;
				} else {
					res[i] = sum;
					sum = 0;
				}
				System.out.println(res[i]);
			}
			
			for(int i = arr2.length; i < arr1.length; i++) {
				sum += arr1[i];
				if(sum > 9) {
					res[i] = sum % 10;
					sum = 1;
				} else {
					res[i] = sum;
					sum = 0;
				}
				System.out.println(res[i]);
			}
			res[res.length - 1] = sum;
		}
		
		System.out.println(noToString(res));
		if(res[res.length - 1] == 0) {
			res = Arrays.copyOf(res, Integer.max(arr1.length, arr2.length));
		}
		
		res = invert(res);
		return res;

	}

	 private static String noToString(int[] no) {
		    StringBuilder sb = new StringBuilder();
		    for(int i = 0; i < no.length; i++) {
		      sb.append(no[i]);
		    }
		    return sb.toString();
		  }
	
	public static void main(String[] args) {
		 int noTests = 6;
		 
		    int[][] op1 = {{0}, {9, 9}, {9}, {2, 1, 7, 8}, 
		                   {5, 0, 5, 0, 5}, {1, 0, 8, 6, 7, 8, 9, 4, 2, 3, 4}};
		    int[][] op2 = {{1, 0, 1}, {1}, {9, 9, 9, 9}, {5, 9, 6}, 
		                   {5, 5, 0, 5, 0}, {3, 4, 2, 8, 9, 7, 9, 2, 3, 4, 9}};
		    int[][] correct = {{1, 0, 1}, {1, 0, 0}, {1, 0, 0, 0, 8}, {2, 7, 7, 4}, 
		                   {1, 0, 5, 5, 5, 5}, {4, 5, 1, 5, 7, 6, 8, 6, 5, 8, 3}};
		 
		    int total = 0;
		    for (int i = 0; i < noTests; i++) {
		      System.out.println("Test " + (i+1) + ":");
		      String op1S = noToString(op1[i]);
		      String op2S = noToString(op2[i]);
		 
		      int[] rez = addBigNumber(op1[i], op2[i]);
		 
		      String rezS = noToString(rez);
		      String correctS = noToString(correct[i]);
		      System.out.println(op1S + " + " + op2S + " = " + rezS + " C: " + correctS + 
		                         "......" + (rezS.equals(correctS) ? "OK" : "WRONG"));
		      System.out.println();
		 
		      total += rezS.equals(correctS) ? 1 : 0;
		    }
		 
		    System.out.println("Your total score is: " + total + " / " + noTests);
		    System.out.println(total > 3 ? "You passed! Hurray! :)" : "Sorry.. :(");
	}

}
