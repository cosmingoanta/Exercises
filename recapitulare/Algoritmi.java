package recapitulare;

import java.util.Collections;

public class Algoritmi {
	public static int complementar(int n) {
		String s = "" + n;
		int aux = 1;
		for(int i = 0; i < s.length(); i++) {
			aux *= 10;
		}
		return aux - n;
	}
	
	public static void puterileBazei(int n, int b) {
		for(int i = 0; i <= b; i++) {
			System.out.print((Math.pow(n, i) + " "));
		}
	}
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return true;
		}
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int recursiveReverse(int n) {
		int sol;
		if(n < 10) {
			return n;
		}
		int res = recursiveReverse(n / 10);
		for(sol = 1; sol <= n/10; sol *= 10);
		return (n % 10) * sol + res;
		
	}
	
	public static int power(int a, int b){
		if(b == 0) {
			return 1;
		}
		return a * power(a, b - 1);
	}
	
	public static void maxChar(String s) {
		s = s.toLowerCase();
		int max = -1;
		int appearances = 0;
		String sol = "";
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				if(!Character.isWhitespace(s.charAt(i)) && s.charAt(i) == s.charAt(j)) {
					 appearances++;
				}
			}
			if(appearances > max) {
				max = appearances;
				sol = "" + s.charAt(i);
			}
			if(appearances == max && !sol.contains(Character.toString(s.charAt(i)))) {
				sol += s.charAt(i);
			}
			appearances = 0;
		}
		for(int i = 0; i < sol.length(); i++) {
			System.out.println("Litera " + sol.charAt(i) + " apare de: " + max);
		}
	}
	
	public static boolean isAnagram(String a, String b) {
		StringBuilder ana1 = new StringBuilder();
		StringBuilder ana2 = new StringBuilder();
		for(int i = 0; i < a.length(); i++) {
			if(Character.isLetter(a.charAt(i))) {
				ana1.append(Character.toLowerCase(a.charAt(i)));
			}
		}
		for(int i = 0; i < b.length(); i++) {
			if(Character.isLetter(b.charAt(i))) {
				ana2.append(Character.toLowerCase(b.charAt(i)));
			}
		}
		if(ana2.length() != ana1.length()) {
			return false;
		}
		for(int i = 0; i < ana1.length(); i++) {
			for(int j = 0; j < ana2.length(); j++) {
				if(ana1.charAt(i) == ana2.charAt(j)) {
					ana1.deleteCharAt(i);
					ana2.deleteCharAt(j); 
					i = 0;
					continue;
				}
			}
		}
		System.out.println(ana1.toString());
		System.out.println(ana2.toString());
		if(ana1.toString().equals(ana2.toString())) {
			return true;
		}
		return false;
		
	}
	
	public static void sumaNumerePrime(int upper) {
		int sum = 0;
		for(int i = 2; i <= upper && sum < upper; i++) {
			if(Algoritmi.isPrime(i)) {
				sum += i;
				System.out.print(sum + " ");	
			}
		}
		
	}
}
